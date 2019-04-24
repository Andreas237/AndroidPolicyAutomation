.class final Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;
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
    name = "TorchSwitchButtonListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;)V
    .locals 0

    .line 736
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 739
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->getTorchState()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 741
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->switchOn()V

    .line 742
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->switchTorchOnAsync(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 744
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->switchOff()V

    .line 745
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->switchTorchOnAsync(Z)V

    :cond_1
    :goto_0
    return-void
.end method
