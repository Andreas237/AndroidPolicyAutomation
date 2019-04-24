.class Lcom/microblink/RecognizerView$4$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/RecognizerView$4;

.field final synthetic val$throwable:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView$4;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$4$2;->this$1:Lcom/microblink/RecognizerView$4;

    iput-object p2, p0, Lcom/microblink/RecognizerView$4$2;->val$throwable:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/RecognizerView$4$2;->this$1:Lcom/microblink/RecognizerView$4;

    iget-object v0, v0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$4$2;->this$1:Lcom/microblink/RecognizerView$4;

    iget-object v0, v0, Lcom/microblink/RecognizerView$4;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/RecognizerView$4$2;->val$throwable:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
