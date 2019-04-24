.class final Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;
.super Ljava/lang/Object;
.source "ScanOverlayImpl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "OCRSwitchButtonListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 773
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 777
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->getRecognitionMode()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 779
    :goto_0
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;

    move-result-object v1

    if-eqz v1, :cond_2

    if-ne p1, v0, :cond_1

    const-string v0, "on"

    goto :goto_1

    :cond_1
    const-string v0, "off"

    .line 781
    :goto_1
    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setState(Ljava/lang/String;)V

    .line 784
    :cond_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRecognitionModeAsync(I)V

    return-void
.end method
