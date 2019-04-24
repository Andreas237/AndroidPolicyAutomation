.class public Lcom/ibotta/android/view/shapes/Circ;
.super Ljava/lang/Object;
.source "Circ.java"


# instance fields
.field private cx:F

.field private cy:F

.field private radius:F


# direct methods
.method public constructor <init>(FFF)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lcom/ibotta/android/view/shapes/Circ;->cx:F

    .line 19
    iput p2, p0, Lcom/ibotta/android/view/shapes/Circ;->cy:F

    .line 20
    iput p3, p0, Lcom/ibotta/android/view/shapes/Circ;->radius:F

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget v1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/ibotta/android/view/shapes/Circ;->cx:F

    .line 25
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    iget v1, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/ibotta/android/view/shapes/Circ;->cy:F

    .line 28
    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget v1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 29
    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    int-to-float p1, v1

    cmpl-float v1, v0, p1

    if-lez v1, :cond_0

    move p1, v0

    .line 30
    :cond_0
    iput p1, p0, Lcom/ibotta/android/view/shapes/Circ;->radius:F

    return-void
.end method


# virtual methods
.method public getCx()F
    .locals 1

    .line 34
    iget v0, p0, Lcom/ibotta/android/view/shapes/Circ;->cx:F

    return v0
.end method

.method public getCy()F
    .locals 1

    .line 42
    iget v0, p0, Lcom/ibotta/android/view/shapes/Circ;->cy:F

    return v0
.end method

.method public getRadius()F
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/android/view/shapes/Circ;->radius:F

    return v0
.end method

.method public setCx(F)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/ibotta/android/view/shapes/Circ;->cx:F

    return-void
.end method

.method public setCy(F)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/ibotta/android/view/shapes/Circ;->cy:F

    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/android/view/shapes/Circ;->radius:F

    return-void
.end method
