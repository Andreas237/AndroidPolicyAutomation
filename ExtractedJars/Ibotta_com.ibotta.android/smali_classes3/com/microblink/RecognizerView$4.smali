.class Lcom/microblink/RecognizerView$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/RecognizerView;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 2
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/RecognizerView$4$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/microblink/RecognizerView$4$1;-><init>(Lcom/microblink/RecognizerView$4;Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$400(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onRecognizerException(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$502(Lcom/microblink/RecognizerView;Z)Z

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/RecognizerView$4$2;

    invoke-direct {v1, p0, p1}, Lcom/microblink/RecognizerView$4$2;-><init>(Lcom/microblink/RecognizerView$4;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$600(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .locals 2
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/RecognizerView$4$3;

    invoke-direct {v1, p0, p1}, Lcom/microblink/RecognizerView$4$3;-><init>(Lcom/microblink/RecognizerView$4;Lcom/microblink/RecognizerResult;)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerView;->access$700(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
