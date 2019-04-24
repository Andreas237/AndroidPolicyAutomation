.class Lcom/microblink/TakePictureInterceptor$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/TakePictureInterceptor;


# direct methods
.method constructor <init>(Lcom/microblink/TakePictureInterceptor;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/TakePictureInterceptor$1;->this$0:Lcom/microblink/TakePictureInterceptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor$1;->this$0:Lcom/microblink/TakePictureInterceptor;

    invoke-static {v0}, Lcom/microblink/TakePictureInterceptor;->access$000(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/TakePictureResult;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor$1;->this$0:Lcom/microblink/TakePictureInterceptor;

    invoke-static {v0}, Lcom/microblink/TakePictureInterceptor;->access$100(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/CameraCaptureListener;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/TakePictureInterceptor$1;->this$0:Lcom/microblink/TakePictureInterceptor;

    invoke-static {v1}, Lcom/microblink/TakePictureInterceptor;->access$000(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/TakePictureResult;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/microblink/CameraCaptureListener;->onCaptured(Lcom/microblink/BitmapResult;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor$1;->this$0:Lcom/microblink/TakePictureInterceptor;

    invoke-static {v0}, Lcom/microblink/TakePictureInterceptor;->access$100(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/CameraCaptureListener;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Unable to capture a comparable frame."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/microblink/CameraCaptureListener;->onException(Ljava/lang/Exception;)V

    return-void
.end method
