.class Lcom/microblink/CameraScanActivity$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;

.field final synthetic val$edgeDetectionResult:Lcom/microblink/EdgeDetectionResult;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;Lcom/microblink/EdgeDetectionResult;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    iput-object p2, p0, Lcom/microblink/CameraScanActivity$10;->val$edgeDetectionResult:Lcom/microblink/EdgeDetectionResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$500(Lcom/microblink/CameraScanActivity;)Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    move-result-object v0

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$500(Lcom/microblink/CameraScanActivity;)Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    move-result-object v0

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->isFinishingScan()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$1200(Lcom/microblink/CameraScanActivity;)Landroid/widget/TextView;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->val$edgeDetectionResult:Lcom/microblink/EdgeDetectionResult;

    invoke-virtual {v0}, Lcom/microblink/EdgeDetectionResult;->state()Lcom/microblink/EdgeDetectionState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/EdgeDetectionState;->state()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$1200(Lcom/microblink/CameraScanActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    :pswitch_1
    iget-object v0, p0, Lcom/microblink/CameraScanActivity$10;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$1200(Lcom/microblink/CameraScanActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
