.class public Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;
.super Ljava/lang/Object;
.source "ScanOverlayImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FrameCompletedContainer"
.end annotation


# instance fields
.field private hasNewTrack:Z

.field private matrixScanEnabled:Z

.field private newlyRecognizedBarcode:Lcom/scandit/recognition/Barcode;

.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;


# direct methods
.method public constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Ljava/util/List;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;ZZ)V"
        }
    .end annotation

    .line 847
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 848
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/scandit/recognition/Barcode;

    :goto_0
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->newlyRecognizedBarcode:Lcom/scandit/recognition/Barcode;

    .line 849
    iput-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->matrixScanEnabled:Z

    .line 850
    iput-boolean p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->hasNewTrack:Z

    return-void
.end method

.method static synthetic access$1600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Z
    .locals 0

    .line 841
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->matrixScanEnabled:Z

    return p0
.end method

.method static synthetic access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;
    .locals 0

    .line 841
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->newlyRecognizedBarcode:Lcom/scandit/recognition/Barcode;

    return-object p0
.end method

.method static synthetic access$1800(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Z
    .locals 0

    .line 841
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->hasNewTrack:Z

    return p0
.end method
