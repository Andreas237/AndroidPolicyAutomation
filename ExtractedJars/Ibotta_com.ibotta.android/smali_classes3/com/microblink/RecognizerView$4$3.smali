.class Lcom/microblink/RecognizerView$4$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/RecognizerView$4;

.field final synthetic val$result:Lcom/microblink/RecognizerResult;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView$4;Lcom/microblink/RecognizerResult;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$4$3;->this$1:Lcom/microblink/RecognizerView$4;

    iput-object p2, p0, Lcom/microblink/RecognizerView$4$3;->val$result:Lcom/microblink/RecognizerResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/RecognizerView$4$3;->this$1:Lcom/microblink/RecognizerView$4;

    iget-object v0, v0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$4$3;->this$1:Lcom/microblink/RecognizerView$4;

    iget-object v0, v0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/RecognizerView$4$3;->val$result:Lcom/microblink/RecognizerResult;

    invoke-interface {v0, v1}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    :cond_0
    return-void
.end method
