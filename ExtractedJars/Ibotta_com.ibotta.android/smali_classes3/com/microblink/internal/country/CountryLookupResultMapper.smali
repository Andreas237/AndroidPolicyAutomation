.class public Lcom/microblink/internal/country/CountryLookupResultMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantDetectionMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
        "Lcom/microblink/internal/country/CountryLookup;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native countrySpecificLookups(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p0    # Ljava/lang/String;
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
    .param p4    # Ljava/util/ArrayList;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

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
            "Lcom/microblink/internal/merchant/MerchantDetection;"
        }
    .end annotation
.end method


# virtual methods
.method public transform(Lcom/microblink/internal/country/CountryLookup;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5
    .param p1    # Lcom/microblink/internal/country/CountryLookup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/country/CountryLookup;->countryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/country/CountryLookup;->taxId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/internal/country/CountryLookup;->phoneNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/internal/country/CountryLookup;->streetAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/internal/country/CountryLookup;->csv()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {v1, v2, v3, v4, p1}, Lcom/microblink/internal/country/CountryLookupResultMapper;->countrySpecificLookups(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    const-string v2, "COUNTRY LOOKUP"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object p1

    :catch_0
    move-exception p1

    const-class v1, Lcom/microblink/internal/country/CountryLookupResultMapper;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

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

    check-cast p1, Lcom/microblink/internal/country/CountryLookup;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/country/CountryLookupResultMapper;->transform(Lcom/microblink/internal/country/CountryLookup;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
