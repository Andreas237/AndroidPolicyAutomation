.class final Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;
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
    name = "CameraSwitchButtonListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 758
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;)V
    .locals 0

    .line 758
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 761
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->getCameraFacingDirection()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 762
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setEnabled(Z)V

    .line 763
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCameraFacingDirectionAsync(I)Z

    goto :goto_0

    .line 766
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setEnabled(Z)V

    .line 767
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCameraFacingDirectionAsync(I)Z

    :goto_0
    return-void
.end method
