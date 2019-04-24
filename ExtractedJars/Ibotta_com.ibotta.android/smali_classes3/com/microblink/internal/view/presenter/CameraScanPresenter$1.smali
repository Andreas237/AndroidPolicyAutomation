.class Lcom/microblink/internal/view/presenter/CameraScanPresenter$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/SuccessCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/view/presenter/CameraScanPresenter;


# direct methods
.method constructor <init>(Lcom/microblink/internal/view/presenter/CameraScanPresenter;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter$1;->this$0:Lcom/microblink/internal/view/presenter/CameraScanPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOperationDone(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter$1;->this$0:Lcom/microblink/internal/view/presenter/CameraScanPresenter;

    invoke-static {p1}, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->access$000(Lcom/microblink/internal/view/presenter/CameraScanPresenter;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->access$002(Lcom/microblink/internal/view/presenter/CameraScanPresenter;Z)Z

    :cond_0
    return-void
.end method
