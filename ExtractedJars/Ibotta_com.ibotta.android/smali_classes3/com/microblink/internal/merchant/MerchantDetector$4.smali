.class Lcom/microblink/internal/merchant/MerchantDetector$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/candidate/CandidateCalculator$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/merchant/MerchantDetector;

.field final synthetic val$city:Lcom/microblink/StringType;

.field final synthetic val$country:Ljava/lang/String;

.field final synthetic val$rawResults:Ljava/util/List;

.field final synthetic val$state:Lcom/microblink/StringType;

.field final synthetic val$zip:Lcom/microblink/StringType;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$city:Lcom/microblink/StringType;

    iput-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$zip:Lcom/microblink/StringType;

    iput-object p4, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$state:Lcom/microblink/StringType;

    iput-object p5, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$country:Ljava/lang/String;

    iput-object p6, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$rawResults:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCandidateAppearedThresholdTimes(Lcom/microblink/internal/candidate/Candidate;)V
    .locals 5
    .param p1    # Lcom/microblink/internal/candidate/Candidate;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/services/google/GoogleQueryRepository;

    new-instance v1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;-><init>()V

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;-><init>(Lcom/microblink/internal/services/google/GoogleStoreService;)V

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$city:Lcom/microblink/StringType;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$zip:Lcom/microblink/StringType;

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$state:Lcom/microblink/StringType;

    invoke-static {v3}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$country:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4}, Lcom/microblink/internal/ServiceUtils;->formatLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/microblink/internal/merchant/GoogleCandidateResultMapper;

    iget-object v3, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->val$rawResults:Ljava/util/List;

    invoke-direct {v2, v3, v1}, Lcom/microblink/internal/merchant/GoogleCandidateResultMapper;-><init>(Ljava/util/List;Ljava/lang/String;)V

    new-instance v3, Lcom/microblink/internal/services/google/GoogleQueryRequest;

    invoke-direct {v3}, Lcom/microblink/internal/services/google/GoogleQueryRequest;-><init>()V

    invoke-virtual {v3, v1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;

    move-result-object v1

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;->executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v2, v0}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$400(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, v0, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector$4;->this$0:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-static {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->access$600(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v1

    iget-object v0, v0, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v1, p1, v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    :cond_1
    return-void
.end method
