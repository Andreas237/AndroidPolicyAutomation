.class Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Lcom/scandit/base/camera/SbIVideoPreview$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PreviewCallback"
.end annotation


# instance fields
.field private mSurfaceCreated:Z

.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V
    .locals 0

    .line 385
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 386
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->mSurfaceCreated:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$1;)V
    .locals 0

    .line 385
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V

    return-void
.end method


# virtual methods
.method public changed(Lcom/scandit/base/camera/SbIVideoPreview;II)V
    .locals 3

    .line 410
    iget-boolean p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->mSurfaceCreated:Z

    if-nez p1, :cond_0

    return-void

    .line 413
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$600(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Landroid/widget/RelativeLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotationAsync(Landroid/content/Context;)V

    .line 414
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$000(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result p1

    if-lez p1, :cond_1

    .line 415
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    move-result-object p2

    const/4 p3, 0x0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    .line 416
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$000(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result v0

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I

    move-result v1

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    .line 415
    invoke-virtual {p2, p3, v0, v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;->sendMessage(Landroid/os/Message;)Z

    :cond_1
    return-void
.end method

.method public created(Lcom/scandit/base/camera/SbIVideoPreview;II)V
    .locals 0

    .line 422
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$700(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/base/camera/SbIVideoPreview;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewSurfaceAsync(Lcom/scandit/base/camera/SbIVideoPreview;)V

    .line 423
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$600(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Landroid/widget/RelativeLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotationAsync(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 424
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->mSurfaceCreated:Z

    return-void
.end method

.method public destroyed(Lcom/scandit/base/camera/SbIVideoPreview;)V
    .locals 1

    const/4 p1, 0x0

    .line 393
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->mSurfaceCreated:Z

    .line 394
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$400(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 402
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->blockUntilCameraClosed(Ljava/lang/Runnable;)V

    .line 403
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewSurfaceAsync(Lcom/scandit/base/camera/SbIVideoPreview;)V

    :cond_0
    return-void
.end method

.method public isSurfaceCreated()Z
    .locals 1

    .line 388
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->mSurfaceCreated:Z

    return v0
.end method
