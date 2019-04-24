.class Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;->this$0:Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;

    iput-object p2, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantDetection;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {p1, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
