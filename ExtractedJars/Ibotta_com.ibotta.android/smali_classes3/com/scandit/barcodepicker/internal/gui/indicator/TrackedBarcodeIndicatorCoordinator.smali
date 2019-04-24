.class public Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;
.super Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;
.source "TrackedBarcodeIndicatorCoordinator.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;
    }
.end annotation


# instance fields
.field private final mColors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mInterpolator:Landroid/view/animation/Interpolator;

.field private final mMainHandler:Landroid/os/Handler;

.field private final mParentView:Landroid/view/View;

.field private final mTrackedMovements:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 52
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;-><init>(Landroid/content/Context;)V

    .line 47
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mMainHandler:Landroid/os/Handler;

    .line 54
    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mParentView:Landroid/view/View;

    .line 55
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 56
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mTrackedMovements:Ljava/util/Map;

    .line 57
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    .line 58
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const v0, -0x40c60070

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const v0, -0x403a3f40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mTrackedMovements:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$200(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$300(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Landroid/view/View;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mParentView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$400(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Landroid/view/animation/Interpolator;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mInterpolator:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method private drawState(Landroid/graphics/Canvas;I)V
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mTrackedMovements:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 133
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mTrackedMovements:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;

    .line 134
    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->access$100(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;)I

    move-result v2

    if-ne v2, p2, :cond_0

    .line 135
    invoke-virtual {v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->getBarcodeIndicator()Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public didProcess(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 0

    .line 65
    instance-of p1, p3, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    if-eqz p1, :cond_0

    .line 66
    check-cast p3, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    .line 67
    new-instance p1, Ljava/util/HashMap;

    invoke-virtual {p3}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getTrackedCodes()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance p2, Ljava/util/HashSet;

    .line 68
    invoke-virtual {p3}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getAllRejectedTrackedCodes()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 67
    invoke-virtual {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->setTrackedBarcodes(Ljava/util/Map;Ljava/util/Set;)V

    :cond_0
    return-void
.end method

.method protected internalDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 120
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 121
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->drawState(Landroid/graphics/Canvas;I)V

    const/4 v0, 0x3

    .line 122
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->drawState(Landroid/graphics/Canvas;I)V

    const/4 v0, 0x2

    .line 123
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->drawState(Landroid/graphics/Canvas;I)V

    :cond_0
    return-void
.end method

.method public declared-synchronized setActive(Z)V
    .locals 0

    monitor-enter p0

    .line 111
    :try_start_0
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setActive(Z)V

    if-nez p1, :cond_0

    .line 114
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mTrackedMovements:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setColors(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mColors:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public declared-synchronized setTrackedBarcodes(Ljava/util/Map;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/TrackedBarcode;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 74
    :try_start_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->isActive()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 76
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->mMainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;-><init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;Ljava/util/Map;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
