.class public Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;
.super Ljava/lang/Object;
.source "QuadrilateralEvaluator.java"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Lcom/scandit/recognition/Quadrilateral;",
        ">;"
    }
.end annotation


# instance fields
.field private mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/scandit/recognition/Quadrilateral;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    return-void
.end method

.method private evaluateInt(FII)I
    .locals 0

    sub-int/2addr p3, p2

    int-to-float p3, p3

    mul-float/2addr p1, p3

    float-to-int p1, p1

    add-int/2addr p2, p1

    return p2
.end method


# virtual methods
.method public evaluate(FLcom/scandit/recognition/Quadrilateral;Lcom/scandit/recognition/Quadrilateral;)Lcom/scandit/recognition/Quadrilateral;
    .locals 8

    .line 28
    iget-object v0, p2, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p3, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-direct {p0, p1, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v0

    .line 29
    iget-object v1, p2, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget-object v2, p3, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-direct {p0, p1, v1, v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v1

    .line 30
    iget-object v2, p2, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget-object v3, p3, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    invoke-direct {p0, p1, v2, v3}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v2

    .line 31
    iget-object v3, p2, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    iget-object v4, p3, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    invoke-direct {p0, p1, v3, v4}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v3

    .line 32
    iget-object v4, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    iget-object v5, p3, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    invoke-direct {p0, p1, v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v4

    .line 33
    iget-object v5, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    iget-object v6, p3, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v6, v6, Landroid/graphics/Point;->y:I

    invoke-direct {p0, p1, v5, v6}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v5

    .line 34
    iget-object v6, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget v6, v6, Landroid/graphics/Point;->x:I

    iget-object v7, p3, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    invoke-direct {p0, p1, v6, v7}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result v6

    .line 35
    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget p2, p2, Landroid/graphics/Point;->y:I

    iget-object p3, p3, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-direct {p0, p1, p2, p3}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluateInt(FII)I

    move-result p1

    .line 37
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    if-eqz p2, :cond_0

    .line 38
    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iput v0, p2, Landroid/graphics/Point;->x:I

    .line 39
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iput v1, p2, Landroid/graphics/Point;->y:I

    .line 40
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iput v2, p2, Landroid/graphics/Point;->x:I

    .line 41
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iput v3, p2, Landroid/graphics/Point;->y:I

    .line 42
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iput v4, p2, Landroid/graphics/Point;->x:I

    .line 43
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iput v5, p2, Landroid/graphics/Point;->y:I

    .line 44
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iput v6, p2, Landroid/graphics/Point;->x:I

    .line 45
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    iget-object p2, p2, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iput p1, p2, Landroid/graphics/Point;->y:I

    .line 47
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->mQuadrilateral:Lcom/scandit/recognition/Quadrilateral;

    return-object p1

    .line 49
    :cond_0
    new-instance p2, Lcom/scandit/recognition/Quadrilateral;

    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v6, p1}, Landroid/graphics/Point;-><init>(II)V

    invoke-direct {p2, p3, v0, v1, v2}, Lcom/scandit/recognition/Quadrilateral;-><init>(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V

    return-object p2
.end method

.method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p2, Lcom/scandit/recognition/Quadrilateral;

    check-cast p3, Lcom/scandit/recognition/Quadrilateral;

    invoke-virtual {p0, p1, p2, p3}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;->evaluate(FLcom/scandit/recognition/Quadrilateral;Lcom/scandit/recognition/Quadrilateral;)Lcom/scandit/recognition/Quadrilateral;

    move-result-object p1

    return-object p1
.end method
