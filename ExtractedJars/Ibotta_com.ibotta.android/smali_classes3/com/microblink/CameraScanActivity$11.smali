.class Lcom/microblink/CameraScanActivity$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/CameraCaptureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptured(Lcom/microblink/BitmapResult;)V
    .locals 3
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0, p1}, Lcom/microblink/CameraScanActivity;->access$1302(Lcom/microblink/CameraScanActivity;Lcom/microblink/BitmapResult;)Lcom/microblink/BitmapResult;

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/microblink/CameraScanActivity;->access$202(Lcom/microblink/CameraScanActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$1400(Lcom/microblink/CameraScanActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object p1

    const/16 v0, 0x3e8

    iput v0, p1, Landroid/os/Message;->what:I

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$1400(Lcom/microblink/CameraScanActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x190

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public onException(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$11;->this$0:Lcom/microblink/CameraScanActivity;

    sget v0, Lcom/microblink/library/R$string;->camera_frame_error:I

    invoke-virtual {p1, v0}, Lcom/microblink/CameraScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
