.class public Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;
.super Ljava/lang/Object;
.source "FastBubbleScrollerHelper.java"


# static fields
.field private static final SNAP_TO_BOTTOM:F = 1.0f

.field private static final SNAP_TO_TOP:F = 0.0f

.field private static final TRACK_SNAP_RANGE:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getProportion(IFIF)F
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpl-float v3, p4, v2

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    int-to-float p3, p3

    add-float/2addr p4, p3

    add-int/lit8 p3, p1, -0x5

    int-to-float p3, p3

    cmpl-float p3, p4, p3

    if-ltz p3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    int-to-float p1, p1

    div-float p1, p2, p1

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    move v2, p1

    :goto_2
    return v2
.end method

.method private getValueInRange(IF)I
    .locals 1

    float-to-int p2, p2

    const/4 v0, 0x0

    .line 42
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 43
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public static shouldExpandAppBarLayout(ZZZ)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public calculatePosition(IIF)I
    .locals 0

    sub-int/2addr p1, p2

    int-to-float p2, p1

    mul-float p2, p2, p3

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->getValueInRange(IF)I

    move-result p1

    return p1
.end method

.method public getTargetPosition(IFIFI)I
    .locals 1

    if-gtz p5, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    add-int/lit8 v0, p5, -0x1

    .line 14
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->getProportion(IFIF)F

    move-result p1

    int-to-float p2, p5

    mul-float p1, p1, p2

    float-to-int p1, p1

    int-to-float p1, p1

    .line 16
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->getValueInRange(IF)I

    move-result p1

    return p1
.end method
