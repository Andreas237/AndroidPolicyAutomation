.class public Lcom/scandit/base/camera/SbFocusEvent$Area;
.super Ljava/lang/Object;
.source "SbFocusEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbFocusEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Area"
.end annotation


# instance fields
.field mHeight:F

.field mLeft:F

.field mTop:F

.field mWidth:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 4

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const v2, 0x3f666666    # 0.9f

    const/high16 v3, 0x3f800000    # 1.0f

    if-gez v1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    cmpl-float v1, p1, v3

    if-ltz v1, :cond_1

    move p1, v2

    :cond_1
    :goto_0
    cmpg-float v1, p2, v0

    if-gez v1, :cond_2

    move p2, v0

    goto :goto_1

    :cond_2
    cmpl-float v0, p2, v3

    if-ltz v0, :cond_3

    move p2, v2

    :cond_3
    :goto_1
    add-float v0, p1, p4

    cmpl-float v0, v0, v3

    if-lez v0, :cond_4

    sub-float p4, v3, p1

    :cond_4
    add-float v0, p2, p3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_5

    sub-float p3, v3, p2

    .line 50
    :cond_5
    iput p1, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    .line 51
    iput p2, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    .line 52
    iput p3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    .line 53
    iput p4, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    return-void
.end method

.method public static create(FFFF)Lcom/scandit/base/camera/SbFocusEvent$Area;
    .locals 2

    add-float v0, p0, p3

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    sub-float p3, v1, p0

    :cond_0
    add-float v0, p1, p2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    sub-float p2, v1, p1

    .line 73
    :cond_1
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/scandit/base/camera/SbFocusEvent$Area;-><init>(FFFF)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 94
    instance-of v0, p1, Lcom/scandit/base/camera/SbFocusEvent$Area;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 98
    :cond_0
    check-cast p1, Lcom/scandit/base/camera/SbFocusEvent$Area;

    .line 99
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getTop()F

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getTop()F

    move-result v2

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getLeft()F

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getLeft()F

    move-result v2

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    .line 100
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getWidth()F

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getWidth()F

    move-result v2

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getHeight()F

    move-result p1

    invoke-virtual {p0}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getHeight()F

    move-result v0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getHeight()F
    .locals 1

    .line 89
    iget v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    return v0
.end method

.method public getLeft()F
    .locals 1

    .line 81
    iget v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    return v0
.end method

.method public getTop()F
    .locals 1

    .line 77
    iget v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 85
    iget v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    return v0
.end method

.method public rotate(I)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    add-int/lit16 p1, p1, 0x168

    :cond_1
    const/16 v0, 0x10e

    const/16 v1, 0x5a

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne p1, v1, :cond_2

    .line 115
    iget v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    iget v4, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    add-float/2addr v3, v4

    sub-float/2addr v2, v3

    .line 116
    iget v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    .line 118
    iput v2, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    .line 119
    iput v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    goto :goto_0

    :cond_2
    const/16 v3, 0xb4

    if-ne p1, v3, :cond_3

    .line 121
    iget v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    iget v4, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    add-float/2addr v3, v4

    sub-float v3, v2, v3

    iput v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    .line 122
    iget v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    iget v4, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    add-float/2addr v3, v4

    sub-float/2addr v2, v3

    iput v2, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    goto :goto_0

    :cond_3
    if-ne p1, v0, :cond_6

    .line 124
    iget v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    .line 125
    iget v4, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    iget v5, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    add-float/2addr v4, v5

    sub-float/2addr v2, v4

    .line 127
    iput v3, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mTop:F

    .line 128
    iput v2, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mLeft:F

    :goto_0
    if-eq p1, v1, :cond_4

    if-ne p1, v0, :cond_5

    .line 134
    :cond_4
    iget p1, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    .line 135
    iget v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    iput v0, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mHeight:F

    .line 136
    iput p1, p0, Lcom/scandit/base/camera/SbFocusEvent$Area;->mWidth:F

    :cond_5
    return-void

    .line 130
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported rotation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
