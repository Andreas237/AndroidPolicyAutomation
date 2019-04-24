.class Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;
.super Ljava/lang/Object;
.source "TrackedBarcodeIndicatorCoordinator.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->setTrackedBarcodes(Ljava/util/Map;Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

.field final synthetic val$codes:Ljava/util/Map;

.field final synthetic val$rejectedCodes:Ljava/util/Set;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;Ljava/util/Map;Ljava/util/Set;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->val$codes:Ljava/util/Map;

    iput-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->val$rejectedCodes:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 79
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->val$codes:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 80
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 81
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 82
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 83
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v3}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 86
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 87
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->val$codes:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scandit/recognition/TrackedBarcode;

    .line 89
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v3}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 90
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v3}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;

    move-object v5, v3

    goto :goto_2

    .line 92
    :cond_2
    new-instance v3, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;

    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-virtual {v2}, Lcom/scandit/recognition/TrackedBarcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;-><init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;Lcom/scandit/recognition/Quadrilateral;)V

    .line 93
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {v4}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$000(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v3

    :goto_2
    const/4 v3, 0x1

    .line 96
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$1;->val$rejectedCodes:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    const/4 v9, 0x3

    goto :goto_3

    .line 98
    :cond_3
    invoke-virtual {v2}, Lcom/scandit/recognition/TrackedBarcode;->isRecognized()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x2

    const/4 v9, 0x2

    goto :goto_3

    :cond_4
    const/4 v9, 0x1

    .line 101
    :goto_3
    invoke-virtual {v2}, Lcom/scandit/recognition/TrackedBarcode;->getPredictedLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v6

    .line 102
    invoke-virtual {v2}, Lcom/scandit/recognition/TrackedBarcode;->getDeltaTimeForPrediction()J

    move-result-wide v7

    .line 103
    invoke-virtual {v2}, Lcom/scandit/recognition/TrackedBarcode;->shouldAnimateFromPreviousToNextState()Z

    move-result v10

    .line 101
    invoke-virtual/range {v5 .. v10}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->startMovement(Lcom/scandit/recognition/Quadrilateral;JIZ)V

    goto :goto_1

    :cond_5
    return-void
.end method
