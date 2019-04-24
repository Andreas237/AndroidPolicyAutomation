.class public Lcom/microblink/internal/services/google/GooglePlacesRepository;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/google/GooglePlacesRepository$Listener;
    }
.end annotation


# instance fields
.field private mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "Lcom/microblink/internal/services/google/GooglePlacesResult;",
            ">;"
        }
    .end annotation
.end field

.field private service:Lcom/microblink/internal/services/google/GooglePlacesService;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/google/GooglePlacesService;Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/google/GooglePlacesService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/MerchantDetectionMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/google/GooglePlacesService;",
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "Lcom/microblink/internal/services/google/GooglePlacesResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesRepository;->service:Lcom/microblink/internal/services/google/GooglePlacesService;

    iput-object p2, p0, Lcom/microblink/internal/services/google/GooglePlacesRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    return-void
.end method


# virtual methods
.method public executeLookupByPlaceId(Lcom/microblink/internal/services/google/GooglePlacesRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/google/GooglePlacesRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GooglePlacesRequest;->placesId()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/microblink/internal/services/google/GooglePlacesRepository;->service:Lcom/microblink/internal/services/google/GooglePlacesService;

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GooglePlacesRequest;->apiKey()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Lcom/microblink/internal/services/google/GooglePlacesService;->execute(Ljava/lang/String;Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlaceResponse;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    new-instance v0, Lcom/microblink/internal/services/google/GooglePlacesResult;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GooglePlacesResult;-><init>()V

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/google/GooglePlacesResult;->responses(Ljava/util/List;)Lcom/microblink/internal/services/google/GooglePlacesResult;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
