.class Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;
.super Ljava/lang/Object;
.source "ScanOverlayAlwaysHighlighting.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->frameCompleted(Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

.field final synthetic val$session:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->val$session:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 56
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 57
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->val$session:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyLocalizedCodes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const v2, -0xff0100

    const/high16 v3, -0x10000

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/recognition/Barcode;

    .line 58
    new-instance v4, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-static {v5}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->access$100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    .line 60
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    invoke-virtual {v4, v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setColor(I)V

    .line 62
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->val$session:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/recognition/Barcode;

    .line 65
    new-instance v4, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-static {v5}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->access$100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;-><init>(Landroid/content/Context;)V

    .line 66
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    .line 67
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_3

    :cond_2
    move v1, v3

    :goto_3
    invoke-virtual {v4, v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setColor(I)V

    .line 69
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 72
    :cond_3
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;->invalidate()V

    return-void
.end method
