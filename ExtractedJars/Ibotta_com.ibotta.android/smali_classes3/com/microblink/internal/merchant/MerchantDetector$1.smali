.class Lcom/microblink/internal/merchant/MerchantDetector$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/merchant/MerchantDetector;

.field final synthetic val$phoneMatch:Lcom/microblink/internal/phone/PhoneMatch;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/phone/PhoneMatch;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->val$phoneMatch:Lcom/microblink/internal/phone/PhoneMatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantResult;Ljava/util/Map;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$000(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$100(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object p1

    iget-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->val$phoneMatch:Lcom/microblink/internal/phone/PhoneMatch;

    invoke-virtual {p1, p3, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$1;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V

    return-void
.end method
