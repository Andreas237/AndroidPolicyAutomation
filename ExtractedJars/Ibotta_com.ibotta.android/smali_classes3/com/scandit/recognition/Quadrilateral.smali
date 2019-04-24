.class public Lcom/scandit/recognition/Quadrilateral;
.super Ljava/lang/Object;
.source "Quadrilateral.java"


# instance fields
.field public bottom_left:Landroid/graphics/Point;

.field public bottom_right:Landroid/graphics/Point;

.field public top_left:Landroid/graphics/Point;

.field public top_right:Landroid/graphics/Point;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    .line 32
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    .line 36
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    .line 40
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    return-void
.end method

.method protected constructor <init>(J)V
    .locals 3

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    .line 32
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    .line 36
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    .line 40
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    .line 54
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScQuadrilateral_top_left_get(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    invoke-direct {p0, v0, v1, v2}, Lcom/scandit/recognition/Quadrilateral;->assignPoint(JLandroid/graphics/Point;)V

    .line 55
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScQuadrilateral_top_right_get(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    invoke-direct {p0, v0, v1, v2}, Lcom/scandit/recognition/Quadrilateral;->assignPoint(JLandroid/graphics/Point;)V

    .line 56
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScQuadrilateral_bottom_left_get(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    invoke-direct {p0, v0, v1, v2}, Lcom/scandit/recognition/Quadrilateral;->assignPoint(JLandroid/graphics/Point;)V

    .line 57
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScQuadrilateral_bottom_right_get(J)J

    move-result-wide p1

    iget-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/recognition/Quadrilateral;->assignPoint(JLandroid/graphics/Point;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    .line 32
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    .line 36
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    .line 40
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    .line 47
    iget-object v0, p0, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v1, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Point;->set(II)V

    .line 48
    iget-object p1, p0, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v0, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Point;->set(II)V

    .line 49
    iget-object p1, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget p2, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Point;->set(II)V

    .line 50
    iget-object p1, p0, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget p2, p4, Landroid/graphics/Point;->x:I

    iget p3, p4, Landroid/graphics/Point;->y:I

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Point;->set(II)V

    return-void
.end method

.method private assignPoint(JLandroid/graphics/Point;)V
    .locals 1

    .line 61
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScPoint_x_get(J)I

    move-result v0

    iput v0, p3, Landroid/graphics/Point;->x:I

    .line 62
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScPoint_y_get(J)I

    move-result p1

    iput p1, p3, Landroid/graphics/Point;->y:I

    return-void
.end method
