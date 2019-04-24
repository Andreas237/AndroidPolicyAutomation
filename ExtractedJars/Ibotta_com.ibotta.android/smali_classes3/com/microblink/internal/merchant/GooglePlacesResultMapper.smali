.class public Lcom/microblink/internal/merchant/GooglePlacesResultMapper;
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
        "Lcom/microblink/internal/services/google/GooglePlacesResult;",
        ">;"
    }
.end annotation


# instance fields
.field private gson:Lcom/google/gson/Gson;

.field private final number:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->gson:Lcom/google/gson/Gson;

    iput-object p1, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->number:Ljava/lang/String;

    return-void
.end method

.method private static native processGooglePlacesResults(Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/merchant/MerchantDetection;"
        }
    .end annotation
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GooglePlacesResultMapper{number=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", gson="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transform(Lcom/microblink/internal/services/google/GooglePlacesResult;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/google/GooglePlacesResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GooglePlacesResult;->responses()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/google/GooglePlaceResponse;

    invoke-virtual {v2}, Lcom/microblink/internal/services/google/GooglePlaceResponse;->results()Lcom/microblink/internal/services/google/Result;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->gson:Lcom/google/gson/Gson;

    instance-of v4, v3, Lcom/google/gson/Gson;

    if-nez v4, :cond_1

    invoke-virtual {v3, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    check-cast v3, Lcom/google/gson/Gson;

    invoke-static {v3, v2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->number:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->processGooglePlacesResults(Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_2

    :cond_3
    move-object v1, v0

    :goto_2
    if-eqz v1, :cond_4

    const-string v2, "CANDIDATE FOR PHONE LOOKUP"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-object p1

    :catch_0
    move-exception p1

    const-class v1, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    return-object v0
.end method

.method public bridge synthetic transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/google/GooglePlacesResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/merchant/GooglePlacesResultMapper;->transform(Lcom/microblink/internal/services/google/GooglePlacesResult;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
