.class public Lcom/ibotta/android/util/ViewMath;
.super Ljava/lang/Object;
.source "ViewMath.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public shrinkToFitRatio(IIF)Landroid/graphics/Rect;
    .locals 4

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    div-float v3, v1, v0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    cmpl-float v3, v3, p3

    if-lez v3, :cond_1

    mul-float v1, v0, p3

    goto :goto_1

    :cond_1
    cmpl-float v0, p3, v2

    if-lez v0, :cond_2

    div-float v0, v1, p3

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    float-to-int p3, v1

    float-to-int v0, v0

    .line 37
    rem-int/lit8 v1, p3, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    add-int/lit8 v1, p3, 0x1

    if-gt v1, p1, :cond_3

    move p3, v1

    goto :goto_2

    :cond_3
    add-int/lit8 p3, p3, -0x1

    :goto_2
    if-gez p3, :cond_4

    const/4 p3, 0x0

    .line 48
    :cond_4
    rem-int/lit8 p1, v0, 0x2

    if-ne p1, v3, :cond_6

    add-int/lit8 p1, v0, 0x1

    if-gt p1, p2, :cond_5

    move v0, p1

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, -0x1

    :goto_3
    if-gez v0, :cond_6

    const/4 v0, 0x0

    .line 60
    :cond_6
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v2, v2, p3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method
