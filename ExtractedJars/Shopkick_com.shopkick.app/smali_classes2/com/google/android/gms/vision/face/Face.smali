.class public Lcom/google/android/gms/vision/face/Face;
.super Ljava/lang/Object;


# static fields
.field public static final UNCOMPUTED_PROBABILITY:F = -1.0f


# instance fields
.field private height:F

.field private id:I

.field private width:F

.field private zzca:Landroid/graphics/PointF;

.field private zzcb:F

.field private zzcc:F

.field private zzcd:F

.field private zzce:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Landmark;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Contour;",
            ">;"
        }
    .end annotation
.end field

.field private zzcg:F

.field private zzch:F

.field private zzci:F


# direct methods
.method public constructor <init>(ILandroid/graphics/PointF;FFFFF[Lcom/google/android/gms/vision/face/Landmark;[Lcom/google/android/gms/vision/face/Contour;FFF)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->id:I

    .line 14
    iput-object p2, p0, Lcom/google/android/gms/vision/face/Face;->zzca:Landroid/graphics/PointF;

    .line 15
    iput p3, p0, Lcom/google/android/gms/vision/face/Face;->width:F

    .line 16
    iput p4, p0, Lcom/google/android/gms/vision/face/Face;->height:F

    .line 17
    iput p5, p0, Lcom/google/android/gms/vision/face/Face;->zzcb:F

    .line 18
    iput p6, p0, Lcom/google/android/gms/vision/face/Face;->zzcc:F

    .line 19
    iput p7, p0, Lcom/google/android/gms/vision/face/Face;->zzcd:F

    .line 20
    invoke-static {p8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/vision/face/Face;->zzce:Ljava/util/List;

    .line 21
    invoke-static {p9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/vision/face/Face;->zzcf:Ljava/util/List;

    const/4 p1, 0x0

    cmpl-float p2, p10, p1

    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 p4, -0x40800000    # -1.0f

    if-ltz p2, :cond_0

    cmpg-float p2, p10, p3

    if-gtz p2, :cond_0

    .line 23
    iput p10, p0, Lcom/google/android/gms/vision/face/Face;->zzcg:F

    goto :goto_0

    .line 24
    :cond_0
    iput p4, p0, Lcom/google/android/gms/vision/face/Face;->zzcg:F

    :goto_0
    cmpl-float p2, p11, p1

    if-ltz p2, :cond_1

    cmpg-float p2, p11, p3

    if-gtz p2, :cond_1

    .line 26
    iput p11, p0, Lcom/google/android/gms/vision/face/Face;->zzch:F

    goto :goto_1

    .line 27
    :cond_1
    iput p4, p0, Lcom/google/android/gms/vision/face/Face;->zzch:F

    :goto_1
    cmpl-float p1, p12, p1

    if-ltz p1, :cond_2

    cmpg-float p1, p12, p3

    if-gtz p1, :cond_2

    .line 29
    iput p12, p0, Lcom/google/android/gms/vision/face/Face;->zzci:F

    return-void

    .line 30
    :cond_2
    iput p4, p0, Lcom/google/android/gms/vision/face/Face;->zzci:F

    return-void
.end method


# virtual methods
.method public getContours()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Contour;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/vision/face/Face;->zzcf:Ljava/util/List;

    return-object v0
.end method

.method public getEulerY()F
    .locals 1

    .line 4
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzcb:F

    return v0
.end method

.method public getEulerZ()F
    .locals 1

    .line 5
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzcc:F

    return v0
.end method

.method public getHeight()F
    .locals 1

    .line 3
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->height:F

    return v0
.end method

.method public getId()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->id:I

    return v0
.end method

.method public getIsLeftEyeOpenProbability()F
    .locals 1

    .line 8
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzcg:F

    return v0
.end method

.method public getIsRightEyeOpenProbability()F
    .locals 1

    .line 9
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzch:F

    return v0
.end method

.method public getIsSmilingProbability()F
    .locals 1

    .line 10
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzci:F

    return v0
.end method

.method public getLandmarks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Landmark;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/google/android/gms/vision/face/Face;->zzce:Ljava/util/List;

    return-object v0
.end method

.method public getPosition()Landroid/graphics/PointF;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/google/android/gms/vision/face/Face;->zzca:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/google/android/gms/vision/face/Face;->width:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/vision/face/Face;->zzca:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v4, p0, Lcom/google/android/gms/vision/face/Face;->height:F

    div-float/2addr v4, v3

    sub-float/2addr v2, v4

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public getWidth()F
    .locals 1

    .line 2
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->width:F

    return v0
.end method
