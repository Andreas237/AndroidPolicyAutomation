.class Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;
.super Ljava/lang/Object;
.source "TrackedBarcodeIndicatorCoordinator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LocationMovement"
.end annotation


# instance fields
.field private mAnimator:Landroid/animation/ObjectAnimator;

.field private final mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

.field private state:I

.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;


# direct methods
.method public constructor <init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;Lcom/scandit/recognition/Quadrilateral;)V
    .locals 1

    .line 148
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 144
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    const/4 v0, 0x0

    .line 145
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    .line 149
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    iget-object p1, p1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mContext:Landroid/content/Context;

    invoke-direct {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    .line 150
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    return-void
.end method

.method static synthetic access$100(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;)I
    .locals 0

    .line 141
    iget p0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    return p0
.end method


# virtual methods
.method public getBarcodeIndicator()Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    return-object v0
.end method

.method public declared-synchronized startMovement(Lcom/scandit/recognition/Quadrilateral;JIZ)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    monitor-enter p0

    .line 156
    :try_start_0
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    if-eq p4, v1, :cond_1

    .line 158
    :cond_0
    iput p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    .line 160
    :cond_1
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$200(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v0

    iget v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->setColor(I)V

    .line 161
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->state:I

    invoke-virtual {p4, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->setState(I)V

    .line 163
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    if-eqz p4, :cond_2

    .line 164
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {p4}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 166
    :cond_2
    new-instance p4, Lcom/scandit/recognition/Quadrilateral;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    invoke-direct {p4, v0, v2, v3, v4}, Lcom/scandit/recognition/Quadrilateral;-><init>(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V

    .line 167
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    const-string v2, "location"

    new-instance v3, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;

    invoke-direct {v3, p4}, Lcom/scandit/barcodepicker/internal/gui/indicator/QuadrilateralEvaluator;-><init>(Lcom/scandit/recognition/Quadrilateral;)V

    const/4 p4, 0x2

    new-array p4, p4, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mBarcodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    iget-object v5, v5, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    aput-object v5, p4, v4

    aput-object p1, p4, v1

    invoke-static {v0, v2, v3, p4}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    .line 169
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    new-instance p4, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement$1;

    invoke-direct {p4, p0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement$1;-><init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;)V

    invoke-virtual {p1, p4}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 175
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {p4}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$400(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Landroid/view/animation/Interpolator;

    move-result-object p4

    invoke-virtual {p1, p4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 176
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    if-eqz p5, :cond_3

    const-wide/16 p4, 0x1

    invoke-static {p4, p5, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_3
    const-wide/16 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2, p3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 177
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->mAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
