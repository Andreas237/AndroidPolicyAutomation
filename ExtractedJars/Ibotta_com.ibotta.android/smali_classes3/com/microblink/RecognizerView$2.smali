.class Lcom/microblink/RecognizerView$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/RecognizerView;

.field final synthetic val$e:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$2;->this$0:Lcom/microblink/RecognizerView;

    iput-object p2, p0, Lcom/microblink/RecognizerView$2;->val$e:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/RecognizerView$2;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerView$2;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v0}, Lcom/microblink/RecognizerView;->access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/RecognizerView$2;->val$e:Ljava/lang/Exception;

    invoke-interface {v0, v1}, Lcom/microblink/CameraRecognizerCallback;->onException(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
