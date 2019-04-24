.class Lcom/microblink/RecognizerView$1;
.super Lcom/microblink/SimpleCameraEvents;


# instance fields
.field final synthetic this$0:Lcom/microblink/RecognizerView;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    invoke-direct {p0}, Lcom/microblink/SimpleCameraEvents;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutofocusStarted([Landroid/graphics/Rect;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/microblink/SimpleCameraEvents;->onAutofocusStarted([Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->canFocusCamera(Z)V

    return-void
.end method

.method public onAutofocusStopped([Landroid/graphics/Rect;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/microblink/SimpleCameraEvents;->onAutofocusStopped([Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->canFocusCamera(Z)V

    return-void
.end method

.method public onCameraPreviewStarted()V
    .locals 2

    invoke-super {p0}, Lcom/microblink/SimpleCameraEvents;->onCameraPreviewStarted()V

    iget-object v0, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$000(Lcom/microblink/RecognizerView;)Lcom/microblink/RecognizerDispatcher;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$000(Lcom/microblink/RecognizerView;)Lcom/microblink/RecognizerDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/RecognizerDispatcher;->start()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/RecognizerView$1$1;

    invoke-direct {v1, p0}, Lcom/microblink/RecognizerView$1$1;-><init>(Lcom/microblink/RecognizerView$1;)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$200(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V

    return-void
.end method

.method public onCameraPreviewStopped()V
    .locals 2

    invoke-super {p0}, Lcom/microblink/SimpleCameraEvents;->onCameraPreviewStopped()V

    iget-object v0, p0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/RecognizerView$1$2;

    invoke-direct {v1, p0}, Lcom/microblink/RecognizerView$1$2;-><init>(Lcom/microblink/RecognizerView$1;)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$300(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V

    return-void
.end method
