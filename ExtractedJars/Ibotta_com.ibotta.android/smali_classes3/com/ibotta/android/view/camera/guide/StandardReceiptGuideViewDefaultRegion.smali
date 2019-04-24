.class public Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;
.super Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;
.source "StandardReceiptGuideViewDefaultRegion.java"


# static fields
.field private static final DEFAULT_REGION:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    const v1, 0x3e343958    # 0.176f

    const v2, 0x3d713272    # 0.058886f

    const v3, 0x3e34e7ef

    const v4, 0x3e107f67

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;->DEFAULT_REGION:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getReceiptPercDistFromBottom()D
    .locals 5

    .line 38
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromBottom()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 39
    sget-object v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;->DEFAULT_REGION:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromBottom()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getReceiptPercDistFromLeft()D
    .locals 5

    .line 20
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromLeft()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 21
    sget-object v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;->DEFAULT_REGION:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromLeft()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getReceiptPercDistFromRight()D
    .locals 5

    .line 26
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromRight()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 27
    sget-object v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;->DEFAULT_REGION:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    float-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromRight()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getReceiptPercDistFromTop()D
    .locals 5

    .line 32
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromTop()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 33
    sget-object v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;->DEFAULT_REGION:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    float-to-double v0, v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getReceiptPercDistFromTop()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
