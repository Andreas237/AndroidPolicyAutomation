.class Lcom/microblink/internal/merchant/MerchantDetector$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/abn/ABNRepository$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/merchant/MerchantDetector;

.field final synthetic val$taxMatch:Lcom/microblink/internal/merchant/TaxMatch;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/merchant/TaxMatch;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$3;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector$3;->val$taxMatch:Lcom/microblink/internal/merchant/TaxMatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$3;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->access$500(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$3;->val$taxMatch:Lcom/microblink/internal/merchant/TaxMatch;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v0, v1, p1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$3;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V

    return-void
.end method
