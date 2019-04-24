.class final Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;
.super Landroid/os/Handler;
.source "ScanOverlayImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "BarcodeOverlayMessageHandler"
.end annotation


# static fields
.field static final CLEAR_SEARCH_BAR:I = 0x5

.field static final CLOSED_CAMERA:I = 0x4

.field static final DID_RECOGNIZE_TEXT:I = 0xa

.field static final DID_SCAN_BARCODE:I = 0x2

.field static final FRAME_COMPLETED:I = 0x0

.field static final HIDE_BARCODE_INDICATOR:I = 0x1

.field static final INITIALIZED_CAMERA:I = 0x3

.field static final INVALIDATE:I = 0x6

.field static final ROTATION_CHANGED:I = 0x8

.field static final UPDATE_OCR_STATE:I = 0x9

.field static final UPDATE_TORCH_STATE:I = 0xb

.field static final UPDATE_VIEWFINDER_ACTIVE:I = 0x7


# instance fields
.field mView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 1

    .line 659
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 660
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;->mView:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 664
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;->mView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    if-nez v0, :cond_0

    return-void

    .line 668
    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 729
    :pswitch_1
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    move-result-object v0

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setTorchAvailability(I)V

    goto/16 :goto_1

    .line 686
    :pswitch_2
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->handleSuccessfulScan()V

    goto/16 :goto_1

    :pswitch_3
    const-string v1, "ScanditSDK"

    const-string v4, "UPDATE_OCR_STATE: %d"

    .line 721
    new-array v5, v3, [Ljava/lang/Object;

    iget v6, p1, Landroid/os/Message;->arg1:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 722
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 724
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-ne p1, v3, :cond_1

    const-string p1, "on"

    goto :goto_0

    :cond_1
    const-string p1, "off"

    :goto_0
    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setState(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 680
    :pswitch_4
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$502(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I

    .line 681
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v2

    .line 682
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v4

    .line 683
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v5

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v6

    move-object v1, v0

    .line 681
    invoke-static/range {v1 .. v6}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;IIIII)V

    goto/16 :goto_1

    .line 718
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setScanningActive(Z)V

    goto/16 :goto_1

    .line 711
    :pswitch_6
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 712
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->clear()V

    .line 715
    :cond_2
    :pswitch_7
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    goto/16 :goto_1

    .line 707
    :pswitch_8
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    .line 708
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->freeResources()V

    goto/16 :goto_1

    .line 692
    :pswitch_9
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$900(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    .line 693
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setEnabled(Z)V

    .line 694
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    move-result-object v1

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object v4

    invoke-virtual {v4}, Lcom/scandit/barcodepicker/internal/EngineThread;->getCameraFacingDirection()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setCameraFacingDirection(I)V

    .line 697
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->getCameraFacingDirection()I

    move-result v1

    if-ne v1, v3, :cond_3

    const/4 v2, 0x1

    .line 698
    :cond_3
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1200(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Z

    move-result v1

    if-eq v2, v1, :cond_4

    .line 699
    invoke-static {v0, v2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$1202(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Z)Z

    .line 700
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v2

    .line 701
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v4

    iget v5, p1, Landroid/os/Message;->arg1:I

    iget v6, p1, Landroid/os/Message;->arg2:I

    move-object v1, v0

    .line 700
    invoke-static/range {v1 .. v6}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;IIIII)V

    .line 703
    :cond_4
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    move-result-object p1

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->ensureBeepResourcesLoaded(Landroid/content/Context;)V

    .line 704
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    goto :goto_1

    .line 689
    :pswitch_a
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$800(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    goto :goto_1

    .line 670
    :pswitch_b
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v2

    if-ne v1, v2, :cond_5

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v2

    if-eq v1, v2, :cond_6

    .line 671
    :cond_5
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$302(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I

    .line 672
    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$402(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I

    .line 673
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v2

    .line 674
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v4

    .line 675
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v5

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I

    move-result v6

    move-object v1, v0

    .line 673
    invoke-static/range {v1 .. v6}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;IIIII)V

    .line 677
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->updateIndicator(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)V

    :cond_7
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
