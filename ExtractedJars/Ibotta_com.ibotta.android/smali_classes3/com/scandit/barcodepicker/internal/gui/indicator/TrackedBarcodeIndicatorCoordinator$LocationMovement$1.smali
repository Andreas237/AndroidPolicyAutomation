.class Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement$1;
.super Ljava/lang/Object;
.source "TrackedBarcodeIndicatorCoordinator.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->startMovement(Lcom/scandit/recognition/Quadrilateral;JIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement$1;->this$1:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 172
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement$1;->this$1:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;

    iget-object p1, p1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator$LocationMovement;->this$0:Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->access$300(Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
