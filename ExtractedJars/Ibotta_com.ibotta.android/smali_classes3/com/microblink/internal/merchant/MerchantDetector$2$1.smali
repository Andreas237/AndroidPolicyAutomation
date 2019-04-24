.class Lcom/microblink/internal/merchant/MerchantDetector$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Lcom/microblink/internal/merchant/MerchantDetection;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector$2;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;

    iget-object v0, v0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->access$400(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;

    iget-object v0, v0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->access$300(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;

    iget-object v1, v1, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v0, v1, p1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->this$1:Lcom/microblink/internal/merchant/MerchantDetector$2;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/microblink/internal/merchant/MerchantDetection;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/merchant/MerchantDetector$2$1;->onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V

    return-void
.end method
