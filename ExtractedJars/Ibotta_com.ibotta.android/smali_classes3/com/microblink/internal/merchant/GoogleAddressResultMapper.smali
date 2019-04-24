.class public Lcom/microblink/internal/merchant/GoogleAddressResultMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantDetectionMapper;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
        "Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final formattedAddress:Ljava/lang/String;

.field private gson:Lcom/google/gson/Gson;

.field private final name:Ljava/lang/String;

.field private final rawResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final searchedAddress:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
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
    .param p4    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->gson:Lcom/google/gson/Gson;

    iput-object p1, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->name:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->formattedAddress:Ljava/lang/String;

    iput-object p3, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->searchedAddress:Ljava/lang/String;

    iput-object p4, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->rawResults:Ljava/util/List;

    return-void
.end method

.method private static native processGoogleAddressResults(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
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
    .param p4    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/merchant/MerchantDetection;"
        }
    .end annotation
.end method


# virtual methods
.method public transform(Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->nearbySearchResults()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/google/NearbySearchResults;

    iget-object v3, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->gson:Lcom/google/gson/Gson;

    instance-of v4, v3, Lcom/google/gson/Gson;

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    check-cast v3, Lcom/google/gson/Gson;

    invoke-static {v3, v2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->formattedAddress:Ljava/lang/String;

    iget-object v2, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->searchedAddress:Ljava/lang/String;

    iget-object v4, p0, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->rawResults:Ljava/util/List;

    invoke-static {v1, p1, v2, v3, v4}, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->processGoogleAddressResults(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    if-eqz v1, :cond_3

    const-string v2, "GOOGLE"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object p1

    :catch_0
    move-exception p1

    const-class v1, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-object v0
.end method

.method public bridge synthetic transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/merchant/GoogleAddressResultMapper;->transform(Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
