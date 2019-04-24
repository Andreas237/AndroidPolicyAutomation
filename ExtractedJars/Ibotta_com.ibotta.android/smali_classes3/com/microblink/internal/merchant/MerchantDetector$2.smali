.class Lcom/microblink/internal/merchant/MerchantDetector$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/merchant/MerchantDetector;

.field final synthetic val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

.field final synthetic val$isAsync:Z

.field final synthetic val$rawResults:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/merchant/AddressMatch;Ljava/util/List;Z)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    iput-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$rawResults:Ljava/util/List;

    iput-boolean p4, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$isAsync:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/google/GoogleLookupResponse;)V
    .locals 8
    .param p1    # Lcom/microblink/internal/services/google/GoogleLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleLookupResponse;->results()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleLookupResponse;->results()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/Result;

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/Result;->geometry()Lcom/microblink/internal/services/google/Geometry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/services/google/Geometry;->location()Lcom/microblink/internal/services/google/LocationResponse;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/Result;->formattedAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/Result;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/microblink/internal/Location;

    invoke-direct {v3}, Lcom/microblink/internal/Location;-><init>()V

    invoke-virtual {v0}, Lcom/microblink/internal/services/google/LocationResponse;->lat()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/microblink/internal/Location;->latitude(D)Lcom/microblink/internal/Location;

    move-result-object v3

    invoke-virtual {v0}, Lcom/microblink/internal/services/google/LocationResponse;->lng()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/microblink/internal/Location;->longitude(D)Lcom/microblink/internal/Location;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object p1, v1

    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_3

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;

    new-instance v4, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;

    iget-object v5, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    invoke-virtual {v5}, Lcom/microblink/internal/merchant/AddressMatch;->street()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    invoke-virtual {v6}, Lcom/microblink/internal/merchant/AddressMatch;->city()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    invoke-virtual {v7}, Lcom/microblink/internal/merchant/AddressMatch;->state()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->concatAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$rawResults:Ljava/util/List;

    invoke-direct {v4, p1, v1, v5, v6}, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v3, v4}, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;-><init>(Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V

    iget-object v4, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v4}, Lcom/microblink/internal/merchant/MerchantDetector;->access$300(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v4

    iget-object v5, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    invoke-virtual {v4, v5}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->add(Ljava/lang/Object;)V

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    new-instance v5, Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {v5}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;-><init>()V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->name(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location(Lcom/microblink/internal/Location;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    const/16 v0, 0x32

    invoke-virtual {p1, v0}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius(I)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    aput-object p1, v4, v2

    const/4 v0, 0x1

    new-instance v1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;-><init>(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    const-string v5, "distance"

    invoke-virtual {v1, v5}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object v1

    const-string v5, "store"

    invoke-virtual {v1, v5}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius(I)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object v1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    new-instance v1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;-><init>(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    const-string p1, "distance"

    invoke-virtual {v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    const-string v1, "restaurant"

    invoke-virtual {p1, v1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius(I)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    aput-object p1, v4, v0

    iget-boolean p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$isAsync:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/microblink/internal/merchant/MerchantDetector$2$1;

    invoke-direct {p1, p0}, Lcom/microblink/internal/merchant/MerchantDetector$2$1;-><init>(Lcom/microblink/internal/merchant/MerchantDetector$2;)V

    invoke-virtual {v3, p1, v4}, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->enqueue(Lcom/microblink/OnNullableCompleteListener;[Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    return-void

    :cond_1
    invoke-virtual {v3, v4}, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->execute([Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    iget-object v0, p1, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->access$400(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->access$300(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v0, v1, p1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$300(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->val$addressMatch:Lcom/microblink/internal/merchant/AddressMatch;

    new-instance v1, Lcom/microblink/internal/merchant/MerchantResult;

    invoke-direct {v1}, Lcom/microblink/internal/merchant/MerchantResult;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$2;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {p1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V

    return-void
.end method
