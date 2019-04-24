.class public Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;


# instance fields
.field private repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;->repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->cancel()V

    :cond_0
    return-void
.end method

.method public enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/merchant/MerchantDetection;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    const-class v1, Lcom/microblink/internal/services/lookup/BlinkStoreLookupService;

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceFactory;->create(ILjava/lang/Class;)Lcom/microblink/internal/services/lookup/StoreLookUpService;

    move-result-object v1

    new-instance v2, Lcom/microblink/internal/phone/PhoneResultMapper;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults()Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/microblink/internal/phone/PhoneResultMapper;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;-><init>(Lcom/microblink/internal/services/lookup/StoreLookUpService;Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V

    iput-object v0, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;->repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;->repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    new-instance v1, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess$1;-><init>(Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;Lcom/microblink/OnCompleteListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;)V

    return-void
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 4
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    const-class v1, Lcom/microblink/internal/services/lookup/BlinkStoreLookupService;

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceFactory;->create(ILjava/lang/Class;)Lcom/microblink/internal/services/lookup/StoreLookUpService;

    move-result-object v1

    new-instance v2, Lcom/microblink/internal/phone/PhoneResultMapper;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults()Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/microblink/internal/phone/PhoneResultMapper;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;-><init>(Lcom/microblink/internal/services/lookup/StoreLookUpService;Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V

    iput-object v0, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;->repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;->repository:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
