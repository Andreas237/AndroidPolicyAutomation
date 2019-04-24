.class Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ScanStateUpdate"
.end annotation


# instance fields
.field private errorState:Z

.field private mPicker:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V
    .locals 1

    .line 432
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 429
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->errorState:Z

    .line 433
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$1000(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;)Z
    .locals 0

    .line 428
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->errorState:Z

    return p0
.end method

.method static synthetic access$1002(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;Z)Z
    .locals 0

    .line 428
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->errorState:Z

    return p1
.end method


# virtual methods
.method public onError(Lcom/scandit/recognition/ContextStatusException;)V
    .locals 3

    .line 455
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    .line 457
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object v1

    new-instance v2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$2;

    invoke-direct {v2, p0, v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$2;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;Lcom/scandit/recognition/ContextStatusException;)V

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onFrameCompleted(Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    .line 440
    iget-boolean v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->errorState:Z

    if-nez v1, :cond_0

    .line 441
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object v1

    new-instance v2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;

    invoke-direct {v2, p0, v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->post(Ljava/lang/Runnable;)Z

    const/4 v1, 0x0

    .line 448
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->errorState:Z

    .line 450
    :cond_0
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$900(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    move-result-object v0

    check-cast p1, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->frameCompleted(Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V

    return-void
.end method

.method public onNoCameraAccess()V
    .locals 3

    .line 502
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    .line 504
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object v1

    new-instance v2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$3;

    invoke-direct {v2, p0, v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$3;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onOrientationChange()V
    .locals 3

    .line 489
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    if-eqz v0, :cond_0

    .line 491
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    const/4 v2, 0x0

    .line 492
    iput v2, v1, Landroid/os/Message;->what:I

    .line 493
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 494
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$000(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result v2

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 495
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result v2

    iput v2, v1, Landroid/os/Message;->arg2:I

    .line 496
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public onScanStateChanged(I)V
    .locals 1

    .line 472
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->mPicker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 482
    :pswitch_0
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$900(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setScanningActive(Z)V

    goto :goto_0

    .line 478
    :pswitch_1
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$900(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setScanningActive(Z)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
