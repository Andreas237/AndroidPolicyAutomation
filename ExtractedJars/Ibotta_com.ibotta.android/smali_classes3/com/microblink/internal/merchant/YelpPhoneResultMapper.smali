.class public Lcom/microblink/internal/merchant/YelpPhoneResultMapper;
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
        "Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private gson:Lcom/google/gson/Gson;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/YelpPhoneResultMapper;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method private static native processYelpPhoneResults(Ljava/lang/String;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method


# virtual methods
.method public transform(Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/merchant/YelpPhoneResultMapper;->gson:Lcom/google/gson/Gson;

    instance-of v2, v1, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Lcom/microblink/internal/merchant/YelpPhoneResultMapper;->processYelpPhoneResults(Ljava/lang/String;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_2

    const-string v2, "YELP"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p1

    :catch_0
    move-exception p1

    const-class v1, Lcom/microblink/internal/merchant/YelpPhoneResultMapper;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-object v0
.end method

.method public bridge synthetic transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/merchant/YelpPhoneResultMapper;->transform(Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
