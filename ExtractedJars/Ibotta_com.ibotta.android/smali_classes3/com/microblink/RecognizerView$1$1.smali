.class Lcom/microblink/RecognizerView$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/RecognizerView$1;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView$1;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$1$1;->this$1:Lcom/microblink/RecognizerView$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerView$1$1;->this$1:Lcom/microblink/RecognizerView$1;

    iget-object v0, v0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$1$1;->this$1:Lcom/microblink/RecognizerView$1;

    iget-object v0, v0, Lcom/microblink/RecognizerView$1;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/microblink/CameraRecognizerCallback;->onPreviewStarted()V

    :cond_0
    return-void
.end method
