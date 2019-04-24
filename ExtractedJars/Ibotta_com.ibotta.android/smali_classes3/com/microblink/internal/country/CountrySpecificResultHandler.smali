.class public final Lcom/microblink/internal/country/CountrySpecificResultHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private applicationContext:Landroid/content/Context;

.field private country:Ljava/lang/String;

.field private countryCode:Ljava/lang/String;

.field private detector:Lcom/microblink/internal/merchant/MerchantDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private phone:Lcom/microblink/StringType;

.field private storeAddress:Lcom/microblink/StringType;

.field private taxId:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/microblink/internal/merchant/MerchantDetector;Ljava/lang/String;Lcom/microblink/StringType;Ljava/lang/String;Lcom/microblink/StringType;Lcom/microblink/StringType;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/MerchantDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->applicationContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->country:Ljava/lang/String;

    iput-object p4, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->taxId:Lcom/microblink/StringType;

    iput-object p5, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->countryCode:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p6, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->phone:Lcom/microblink/StringType;

    iput-object p7, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->storeAddress:Lcom/microblink/StringType;

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 9
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->country:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->countryCode:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/country/Country;->getCountryByCode(Ljava/lang/String;)Lcom/microblink/internal/country/Country;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->taxId:Lcom/microblink/StringType;

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/microblink/internal/country/Country;->SPAIN:Lcom/microblink/internal/country/Country;

    if-ne v0, v2, :cond_1

    iget-object v3, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v0}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    const-string v7, ""

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual/range {v3 .. v8}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v2, Lcom/microblink/internal/country/Country;->SINGAPORE:Lcom/microblink/internal/country/Country;

    if-ne v0, v2, :cond_3

    iget-object v1, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->applicationContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v1

    sget-object v2, Lcom/microblink/internal/country/Country;->SINGAPORE:Lcom/microblink/internal/country/Country;

    invoke-virtual {v1, v2}, Lcom/microblink/internal/CountryCsvManager;->contains(Lcom/microblink/internal/country/Country;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->applicationContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v1

    sget-object v2, Lcom/microblink/internal/country/Country;->SINGAPORE:Lcom/microblink/internal/country/Country;

    invoke-virtual {v1, v2}, Lcom/microblink/internal/CountryCsvManager;->parse(Lcom/microblink/internal/country/Country;)V

    :cond_2
    iget-object v3, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v0}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->phone:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->storeAddress:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->applicationContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v0

    sget-object v1, Lcom/microblink/internal/country/Country;->SINGAPORE:Lcom/microblink/internal/country/Country;

    invoke-virtual {v0, v1}, Lcom/microblink/internal/CountryCsvManager;->csv(Lcom/microblink/internal/country/Country;)Ljava/util/ArrayList;

    move-result-object v8

    goto :goto_1

    :cond_3
    sget-object v2, Lcom/microblink/internal/country/Country;->POLAND:Lcom/microblink/internal/country/Country;

    if-ne v0, v2, :cond_4

    iget-object v3, p0, Lcom/microblink/internal/country/CountrySpecificResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v0}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    const-string v7, ""

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_4
    return-object v1
.end method
