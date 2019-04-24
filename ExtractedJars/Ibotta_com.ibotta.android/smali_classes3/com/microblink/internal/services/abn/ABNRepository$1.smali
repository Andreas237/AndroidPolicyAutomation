.class Lcom/microblink/internal/services/abn/ABNRepository$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/abn/ABNResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/abn/ABNRepository;

.field final synthetic val$listener:Lcom/microblink/internal/services/abn/ABNRepository$Listener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/abn/ABNRepository;Lcom/microblink/internal/services/abn/ABNRepository$Listener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/abn/ABNRepository$1;->this$0:Lcom/microblink/internal/services/abn/ABNRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/abn/ABNRepository$1;->val$listener:Lcom/microblink/internal/services/abn/ABNRepository$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/abn/ABNResponse;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/services/abn/ABNResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/abn/ABNRepository$1;->val$listener:Lcom/microblink/internal/services/abn/ABNRepository$Listener;

    iget-object v1, p0, Lcom/microblink/internal/services/abn/ABNRepository$1;->this$0:Lcom/microblink/internal/services/abn/ABNRepository;

    invoke-static {v1}, Lcom/microblink/internal/services/abn/ABNRepository;->access$000(Lcom/microblink/internal/services/abn/ABNRepository;)Lcom/microblink/internal/merchant/ABNResultMapper;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/microblink/internal/merchant/ABNResultMapper;->transform(Lcom/microblink/internal/services/abn/ABNResponse;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/abn/ABNRepository$Listener;->onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/abn/ABNResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/abn/ABNRepository$1;->onComplete(Lcom/microblink/internal/services/abn/ABNResponse;)V

    return-void
.end method
