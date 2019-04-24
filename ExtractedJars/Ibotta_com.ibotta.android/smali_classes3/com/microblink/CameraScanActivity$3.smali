.class Lcom/microblink/CameraScanActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$3;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/microblink/CameraScanActivity$3;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {p1}, Lcom/microblink/CameraScanActivity;->access$500(Lcom/microblink/CameraScanActivity;)Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onCancelScanPressed()V

    return-void
.end method
