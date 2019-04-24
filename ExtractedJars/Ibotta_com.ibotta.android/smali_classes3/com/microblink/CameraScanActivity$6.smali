.class Lcom/microblink/CameraScanActivity$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/InitializeCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$6;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onException(Lcom/microblink/ReceiptSdkException;)V
    .locals 2
    .param p1    # Lcom/microblink/ReceiptSdkException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$6;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-virtual {p1}, Lcom/microblink/ReceiptSdkException;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$6;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-virtual {p1}, Lcom/microblink/CameraScanActivity;->finish()V

    return-void
.end method

.method public onInitialized()V
    .locals 0

    return-void
.end method
