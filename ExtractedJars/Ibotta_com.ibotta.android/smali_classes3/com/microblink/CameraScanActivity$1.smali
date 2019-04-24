.class Lcom/microblink/CameraScanActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$000(Lcom/microblink/CameraScanActivity;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$100(Lcom/microblink/CameraScanActivity;)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$200(Lcom/microblink/CameraScanActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$400(Lcom/microblink/CameraScanActivity;)Lcom/microblink/DynamicViewPort;

    move-result-object p1

    const v0, 0x106000c

    invoke-virtual {p1, v0}, Lcom/microblink/DynamicViewPort;->setBackgroundColorViewPort(I)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$500(Lcom/microblink/CameraScanActivity;)Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onPhotoCaptured()V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$1;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$600(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/microblink/library/R$drawable;->add_button_selector:I

    invoke-static {p1, p1, v0, v1}, Lcom/microblink/CameraScanActivity;->access$700(Lcom/microblink/CameraScanActivity;Landroid/content/Context;Landroid/view/View;I)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
