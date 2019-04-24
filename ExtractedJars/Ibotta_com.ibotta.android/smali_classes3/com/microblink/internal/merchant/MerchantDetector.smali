.class public final Lcom/microblink/internal/merchant/MerchantDetector;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;,
        Lcom/microblink/internal/merchant/MerchantDetector$State;
    }
.end annotation


# static fields
.field public static final DETECTOR_LOOKUP_COMPLETED:I = 0x1

.field public static final DETECTOR_LOOKUP_RUNNING:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MerchantDetector"


# instance fields
.field private addressCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/AddressMatch;",
            ">;"
        }
    .end annotation
.end field

.field private apiMerchant:Lcom/microblink/internal/merchant/MerchantResult;

.field private calls:Ljava/util/concurrent/atomic/AtomicInteger;

.field private candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field

.field private candidateForPhoneLookupSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;"
        }
    .end annotation
.end field

.field private candidateParser:Lcom/microblink/internal/candidate/CandidateParser;

.field private merchantCandidateCalculator:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

.field private observers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;",
            ">;"
        }
    .end annotation
.end field

.field private phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/phone/PhoneMatch;",
            ">;"
        }
    .end annotation
.end field

.field private phoneResultMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;"
        }
    .end annotation
.end field

.field private storeLookupProcess:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

.field private taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/TaxMatch;",
            ">;"
        }
    .end annotation
.end field

.field private validator:Lcom/microblink/internal/merchant/MerchantResultValidator;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;Lcom/microblink/internal/merchant/MerchantResultValidator;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/services/merchant/MerchantLookupProcess;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/MerchantResultValidator;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneResultMap:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-direct {v0, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-direct {v0, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-direct {v0, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-direct {v0, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateForPhoneLookupSet:Ljava/util/Set;

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->storeLookupProcess:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    new-instance p1, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;-><init>(I)V

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->merchantCandidateCalculator:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

    new-instance p1, Lcom/microblink/internal/candidate/CandidateParserImpl;

    invoke-direct {p1}, Lcom/microblink/internal/candidate/CandidateParserImpl;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateParser:Lcom/microblink/internal/candidate/CandidateParser;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneResultMap:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/internal/merchant/MerchantDetector;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->decrementCallCount()V

    return-void
.end method

.method static synthetic access$300(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/internal/merchant/MerchantDetector;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateForPhoneLookupSet:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object p0
.end method

.method static synthetic access$600(Lcom/microblink/internal/merchant/MerchantDetector;)Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object p0
.end method

.method private decrementCallCount()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;->onStateChange(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private incrementCallCount()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;->onStateChange(I)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final addressCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/AddressMatch;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object v0
.end method

.method public final apiMerchant()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->apiMerchant:Lcom/microblink/internal/merchant/MerchantResult;

    return-object v0
.end method

.method public final cancel()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->cancel()V

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->storeLookupProcess:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    invoke-virtual {v0}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->cancel()V

    invoke-virtual {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->removeAllObservers()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "MerchantDetector"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final candidateForPhoneLookup()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateForPhoneLookupSet:Ljava/util/Set;

    return-object v0
.end method

.method public final detectMerchant(Lcom/microblink/internal/candidate/CandidateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/candidate/CandidateResult;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/merchant/MerchantResult;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/services/google/GoogleQueryRepository;

    new-instance v1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;-><init>()V

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;-><init>(Lcom/microblink/internal/services/google/GoogleStoreService;)V

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/CandidateResult;->acceptedCandidates()Ljava/util/List;

    move-result-object v1

    invoke-static {p2, p3, p4, p5}, Lcom/microblink/internal/ServiceUtils;->formatLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/microblink/internal/candidate/Candidate;

    invoke-virtual {p4}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_0

    iget-object p5, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p5, p4}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->add(Ljava/lang/Object;)V

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    new-instance v1, Lcom/microblink/internal/services/google/GoogleQueryRequest;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;-><init>()V

    invoke-virtual {v1, p5}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;

    move-result-object v1

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;->executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/microblink/internal/merchant/GoogleCandidateResultMapper;

    invoke-direct {v2, p6, p5}, Lcom/microblink/internal/merchant/GoogleCandidateResultMapper;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p5

    if-eqz p5, :cond_0

    iget-object v1, p5, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateForPhoneLookupSet:Ljava/util/Set;

    iget-object v2, p5, Lcom/microblink/internal/merchant/MerchantDetection;->candidateForPhoneLookup:Ljava/util/ArrayList;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    iget-object p5, p5, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v1, p4, p5}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->foundMerchants()Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lcom/microblink/internal/candidate/CandidateResult;->acceptedIfNoMatch()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_4

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/candidate/Candidate;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p2, Lcom/microblink/internal/merchant/MerchantResult;

    invoke-direct {p2}, Lcom/microblink/internal/merchant/MerchantResult;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    return-object p2

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final detectMerchant(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantResult;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/ArrayList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/microblink/internal/merchant/MerchantResult;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/country/CountryLookupResultMapper;

    invoke-direct {v0}, Lcom/microblink/internal/country/CountryLookupResultMapper;-><init>()V

    new-instance v1, Lcom/microblink/internal/country/CountryLookup;

    invoke-direct {v1}, Lcom/microblink/internal/country/CountryLookup;-><init>()V

    invoke-virtual {v1, p1}, Lcom/microblink/internal/country/CountryLookup;->countryCode(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/microblink/internal/country/CountryLookup;->taxId(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/microblink/internal/country/CountryLookup;->taxId(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/microblink/internal/country/CountryLookup;->streetAddress(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/microblink/internal/country/CountryLookup;->csv(Ljava/util/ArrayList;)Lcom/microblink/internal/country/CountryLookup;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/microblink/internal/country/CountryLookupResultMapper;->transform(Lcom/microblink/internal/country/CountryLookup;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final detectMerchant(Ljava/util/Collection;Ljava/lang/String;)Lcom/microblink/internal/merchant/MerchantResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/microblink/internal/merchant/MerchantResult;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/services/google/GooglePlacesRepository;

    new-instance v1, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;-><init>()V

    new-instance v2, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;

    invoke-direct {v2, p2}, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/google/GooglePlacesRepository;-><init>(Lcom/microblink/internal/services/google/GooglePlacesService;Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/merchant/MerchantResult;

    iget-object v2, v1, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lcom/microblink/internal/services/google/GooglePlacesRequest;

    invoke-direct {p1}, Lcom/microblink/internal/services/google/GooglePlacesRequest;-><init>()V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/microblink/internal/services/google/GooglePlacesRequest;->apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlacesRequest;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/microblink/internal/services/google/GooglePlacesRequest;->placesId(Ljava/util/List;)Lcom/microblink/internal/services/google/GooglePlacesRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/google/GooglePlacesRepository;->executeLookupByPlaceId(Lcom/microblink/internal/services/google/GooglePlacesRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/internal/merchant/MerchantDetector;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    iget-object v0, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-interface {p2, v0}, Lcom/microblink/internal/merchant/MerchantResultValidator;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/merchant/AddressMatch;Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/ScanOptions;",
            "Lcom/microblink/internal/merchant/AddressMatch;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->incrementCallCount()V

    new-instance p1, Lcom/microblink/internal/merchant/AddressSearchRequest;

    invoke-direct {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;-><init>()V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/merchant/AddressSearchRequest;->apiKey(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;

    move-result-object p1

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/AddressMatch;->street()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/merchant/AddressSearchRequest;->street(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;

    move-result-object p1

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/AddressMatch;->city()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/merchant/AddressSearchRequest;->city(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;

    move-result-object p1

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/AddressMatch;->state()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/merchant/AddressSearchRequest;->state(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;

    move-result-object p1

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/AddressMatch;->zip()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/merchant/AddressSearchRequest;->zip(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/google/GoogleQueryRepository;

    new-instance v1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;-><init>()V

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;-><init>(Lcom/microblink/internal/services/google/GoogleStoreService;)V

    new-instance v1, Lcom/microblink/internal/merchant/MerchantDetector$2;

    invoke-direct {v1, p0, p2, p3, p4}, Lcom/microblink/internal/merchant/MerchantDetector$2;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/merchant/AddressMatch;Ljava/util/List;Z)V

    invoke-virtual {v0, p1, v1}, Lcom/microblink/internal/services/google/GoogleQueryRepository;->lookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "MerchantDetector"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/merchant/TaxMatch;Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/ScanOptions;",
            "Lcom/microblink/internal/merchant/TaxMatch;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p1, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->add(Ljava/lang/Object;)V

    new-instance p1, Lcom/microblink/internal/services/abn/ABNLookupRequest;

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/TaxMatch;->taxId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "c6253242-738f-4504-ab01-d02b3b69316f"

    invoke-direct {p1, v0, v1}, Lcom/microblink/internal/services/abn/ABNLookupRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/microblink/internal/services/abn/ABNRepository;

    new-instance v1, Lcom/microblink/internal/services/abn/ABNServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/abn/ABNServiceImpl;-><init>()V

    new-instance v2, Lcom/microblink/internal/merchant/ABNResultMapper;

    invoke-direct {v2, p3}, Lcom/microblink/internal/merchant/ABNResultMapper;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/abn/ABNRepository;-><init>(Lcom/microblink/internal/services/abn/ABNLookupService;Lcom/microblink/internal/merchant/ABNResultMapper;)V

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->incrementCallCount()V

    if-eqz p4, :cond_0

    new-instance p3, Lcom/microblink/internal/merchant/MerchantDetector$3;

    invoke-direct {p3, p0, p2}, Lcom/microblink/internal/merchant/MerchantDetector$3;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/merchant/TaxMatch;)V

    invoke-virtual {v0, p1, p3}, Lcom/microblink/internal/services/abn/ABNRepository;->lookupService(Lcom/microblink/internal/services/abn/ABNLookupRequest;Lcom/microblink/internal/services/abn/ABNRepository$Listener;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/abn/ABNRepository;->executeLookupService(Lcom/microblink/internal/services/abn/ABNLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->decrementCallCount()V

    iget-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {p3, p2, p1}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "MerchantDetector"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/phone/PhoneMatch;Ljava/util/ArrayList;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/ScanOptions;",
            "Lcom/microblink/internal/phone/PhoneMatch;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    new-instance p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;-><init>()V

    invoke-virtual {p2}, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber(Lcom/microblink/internal/phone/PhoneNumber;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults(Ljava/util/ArrayList;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    move-result-object p1

    iget-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p3, p2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->add(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->incrementCallCount()V

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector;->storeLookupProcess:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    new-instance p4, Lcom/microblink/internal/merchant/MerchantDetector$1;

    invoke-direct {p4, p0, p2}, Lcom/microblink/internal/merchant/MerchantDetector$1;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/internal/phone/PhoneMatch;)V

    invoke-virtual {p3, p1, p4}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;)V

    return-void

    :cond_0
    iget-object p3, p0, Lcom/microblink/internal/merchant/MerchantDetector;->storeLookupProcess:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    invoke-virtual {p3, p1}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p3, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_0

    :cond_1
    new-instance p3, Lcom/microblink/internal/merchant/MerchantResult;

    invoke-direct {p3}, Lcom/microblink/internal/merchant/MerchantResult;-><init>()V

    :goto_0
    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneResultMap:Ljava/util/Map;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->phoneLookupMap:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_2
    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {p1, p2, p3}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->decrementCallCount()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "MerchantDetector"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final detectMerchant(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p4}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResult;

    invoke-direct {v0}, Lcom/microblink/internal/merchant/MerchantResult;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->apiMerchant:Lcom/microblink/internal/merchant/MerchantResult;

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->apiMerchant:Lcom/microblink/internal/merchant/MerchantResult;

    iput-object p1, v0, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/microblink/internal/merchant/MerchantDetector;->apiMerchant:Lcom/microblink/internal/merchant/MerchantResult;

    iput-object p3, p1, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    iput-object p4, p1, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final hasFoundMerchant()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->candidateCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isLookupComplete()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final observeStateChange(Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;->onStateChange(I)V

    return-void
.end method

.method public final ocrMerchantCandidateResultHandler()Lcom/microblink/internal/candidate/CandidateCalculator;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->merchantCandidateCalculator:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

    return-object v0
.end method

.method public final phoneCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/phone/PhoneMatch;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object v0
.end method

.method public final phoneResults()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->phoneResultMap:Ljava/util/Map;

    return-object v0
.end method

.method public final removeAllObservers()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "MerchantDetector"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final storeMerchantCandidate(Ljava/lang/String;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/StringType;",
            "Lcom/microblink/StringType;",
            "Lcom/microblink/StringType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v8, p0

    :try_start_0
    iget-object v0, v8, Lcom/microblink/internal/merchant/MerchantDetector;->candidateParser:Lcom/microblink/internal/candidate/CandidateParser;

    move-object v1, p1

    invoke-interface {v0, p1}, Lcom/microblink/internal/candidate/CandidateParser;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->incrementCallCount()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/microblink/internal/candidate/Candidate;

    iget-object v10, v8, Lcom/microblink/internal/merchant/MerchantDetector;->merchantCandidateCalculator:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

    new-instance v11, Lcom/microblink/internal/merchant/MerchantDetector$4;

    move-object v1, v11

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/microblink/internal/merchant/MerchantDetector$4;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v10, v9, v11}, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->update(Lcom/microblink/internal/candidate/Candidate;Lcom/microblink/internal/candidate/CandidateCalculator$Listener;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantDetector;->decrementCallCount()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "MerchantDetector"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final taxResultCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/TaxMatch;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->taxMatchCoordinator:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-object v0
.end method

.method public final unobserve(Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantDetector;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
