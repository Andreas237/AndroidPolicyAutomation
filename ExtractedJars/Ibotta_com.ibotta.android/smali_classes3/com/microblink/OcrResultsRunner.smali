.class final Lcom/microblink/OcrResultsRunner;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "OcrResultsRunner"


# instance fields
.field private callback:Lcom/microblink/RecognizerCallback;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private status:I

.field private summaryStats:Lcom/microblink/SummaryStats;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;ILcom/microblink/RecognizerCallback;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/microblink/OcrResultsRunner;-><init>(Landroid/content/Context;Lcom/microblink/SummaryStats;ILcom/microblink/RecognizerCallback;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/microblink/SummaryStats;ILcom/microblink/RecognizerCallback;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/SummaryStats;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    iput-object p4, p0, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/OcrResultsRunner;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/microblink/OcrResultsRunner;->summaryStats:Lcom/microblink/SummaryStats;

    iput p3, p0, Lcom/microblink/OcrResultsRunner;->status:I

    return-void
.end method

.method private finishing()Z
    .locals 2

    iget v0, p0, Lcom/microblink/OcrResultsRunner;->status:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static native fromServerPrices()Lcom/microblink/OcrResult;
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->receipt()Lcom/microblink/Receipt;

    move-result-object v2

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->scanOptions()Lcom/microblink/ScanOptions;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    new-instance v7, Lcom/microblink/RecognizerNotInitializedException;

    const-string v8, "Recognizer thread has been interrupted!"

    invoke-direct {v7, v8}, Lcom/microblink/RecognizerNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v7}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->initialized()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    new-instance v7, Lcom/microblink/RecognizerNotInitializedException;

    const-string v8, "Recognizer was terminated before finishing!"

    invoke-direct {v7, v8}, Lcom/microblink/RecognizerNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v7}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/microblink/OcrResultsRunner;->fromServerPrices()Lcom/microblink/OcrResult;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/microblink/OcrResult;

    invoke-direct {v0}, Lcom/microblink/OcrResult;-><init>()V

    :goto_0
    move-object v7, v0

    if-nez v7, :cond_3

    iget-object v0, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    new-instance v7, Ljava/lang/Exception;

    const-string v8, "Recognizer unable to parse server prices!"

    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v7}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-virtual {v2}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v0

    iget-object v8, v1, Lcom/microblink/OcrResultsRunner;->context:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->externalStorage()Z

    move-result v9

    invoke-static {v8, v0, v9}, Lcom/microblink/internal/DiskUtils;->capturedFiles(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object v0

    sget-object v9, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    if-eq v0, v9, :cond_4

    invoke-virtual {v0}, Lcom/microblink/Retailer;->bannerId()I

    move-result v0

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lcom/microblink/Receipt;->detectedBannerId()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    :goto_1
    :try_start_1
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v9

    invoke-virtual {v9}, Lcom/microblink/Recognizer;->merchantDetector()Lcom/microblink/internal/merchant/MerchantDetector;

    move-result-object v9

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/microblink/internal/country/Country;->getCountryByCode(Ljava/lang/String;)Lcom/microblink/internal/country/Country;

    move-result-object v10

    new-instance v11, Lcom/microblink/internal/merchant/MerchantResultHandler;

    invoke-direct {v11}, Lcom/microblink/internal/merchant/MerchantResultHandler;-><init>()V

    new-instance v12, Lcom/microblink/LinuxMerchantResultHandler;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lcom/microblink/internal/merchant/MerchantDetector;->apiMerchant()Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v13

    goto :goto_2

    :cond_5
    const/4 v13, 0x0

    :goto_2
    invoke-direct {v12, v13}, Lcom/microblink/LinuxMerchantResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantResult;)V

    invoke-virtual {v11, v12}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v11

    new-instance v12, Lcom/microblink/internal/phone/PhoneMerchantResultHandler;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v13

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    :goto_3
    invoke-direct {v12, v13}, Lcom/microblink/internal/phone/PhoneMerchantResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantResultCoordinators;)V

    invoke-virtual {v11, v12}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v11

    new-instance v12, Lcom/microblink/internal/merchant/TaxMatchResultHandler;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/microblink/internal/merchant/MerchantDetector;->taxResultCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v13

    goto :goto_4

    :cond_7
    const/4 v13, 0x0

    :goto_4
    invoke-direct {v12, v13}, Lcom/microblink/internal/merchant/TaxMatchResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantResultCoordinators;)V

    invoke-virtual {v11, v12}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v11

    new-instance v12, Lcom/microblink/internal/merchant/DetectedMerchantHandler;

    invoke-virtual {v2}, Lcom/microblink/Receipt;->merchantName()Lcom/microblink/StringType;

    move-result-object v13

    invoke-direct {v12, v13, v0}, Lcom/microblink/internal/merchant/DetectedMerchantHandler;-><init>(Lcom/microblink/StringType;I)V

    invoke-virtual {v11, v12}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    new-instance v11, Lcom/microblink/internal/merchant/AddressMerchantResultHandler;

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v12

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    :goto_5
    invoke-direct {v11, v12}, Lcom/microblink/internal/merchant/AddressMerchantResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantResultCoordinators;)V

    invoke-virtual {v0, v11}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    new-instance v15, Lcom/microblink/internal/country/CountrySpecificResultHandler;

    iget-object v11, v1, Lcom/microblink/OcrResultsRunner;->context:Landroid/content/Context;

    if-eqz v10, :cond_9

    invoke-virtual {v10}, Lcom/microblink/internal/country/Country;->countryName()Ljava/lang/String;

    move-result-object v10

    move-object v13, v10

    goto :goto_6

    :cond_9
    const/4 v13, 0x0

    :goto_6
    invoke-virtual {v2}, Lcom/microblink/Receipt;->taxId()Lcom/microblink/StringType;

    move-result-object v14

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object v17

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeAddress()Lcom/microblink/StringType;

    move-result-object v18

    move-object v10, v15

    move-object v12, v9

    move-object v6, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v10 .. v17}, Lcom/microblink/internal/country/CountrySpecificResultHandler;-><init>(Landroid/content/Context;Lcom/microblink/internal/merchant/MerchantDetector;Ljava/lang/String;Lcom/microblink/StringType;Ljava/lang/String;Lcom/microblink/StringType;Lcom/microblink/StringType;)V

    invoke-virtual {v0, v6}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    new-instance v6, Lcom/microblink/internal/candidate/CandidateResultHandler;

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object v12

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object v13

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object v14

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeCountry()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lcom/microblink/Receipt;->rawResults()Ljava/util/ArrayList;

    move-result-object v16

    move-object v10, v6

    move-object v11, v9

    invoke-direct/range {v10 .. v16}, Lcom/microblink/internal/candidate/CandidateResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    new-instance v6, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;)V

    invoke-virtual {v0, v6}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    new-instance v6, Lcom/microblink/BackupResultHandler;

    invoke-direct {v6, v9}, Lcom/microblink/BackupResultHandler;-><init>(Lcom/microblink/internal/merchant/MerchantDetector;)V

    invoke-virtual {v0, v6}, Lcom/microblink/internal/merchant/MerchantResultHandler;->chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultHandler;->determineMerchant()Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v6, :cond_15

    :try_start_2
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeZip(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_a
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeAddress(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_b
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeCity(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_c
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeState(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_d
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeCountry(Ljava/lang/String;)Lcom/microblink/Receipt;

    :cond_e
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_f
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->yelpId(Ljava/lang/String;)Lcom/microblink/Receipt;

    :cond_10
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->googlePlaceId(Ljava/lang/String;)Lcom/microblink/Receipt;

    :cond_11
    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->mallName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_12
    iget v0, v6, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    if-eqz v0, :cond_13

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "%d"

    new-array v11, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v11, v5

    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storeNumber(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_13
    invoke-virtual {v6}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_14

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->merchantSource(Ljava/lang/String;)Lcom/microblink/Receipt;

    :cond_14
    invoke-virtual {v2}, Lcom/microblink/Receipt;->retailerFromLogo()Lcom/microblink/StringType;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v9

    float-to-double v9, v9

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    cmpl-double v13, v9, v11

    if-lez v13, :cond_18

    :goto_7
    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    goto :goto_a

    :cond_15
    invoke-virtual {v2}, Lcom/microblink/Receipt;->retailerFromLogo()Lcom/microblink/StringType;

    move-result-object v0

    if-eqz v0, :cond_16

    goto :goto_7

    :cond_16
    if-nez v0, :cond_18

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->detectLogo()Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v0, :cond_18

    :try_start_3
    invoke-static {v8}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-static {v8}, Lcom/microblink/internal/Utility;->getFirst(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    goto :goto_8

    :cond_17
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_18

    new-instance v9, Lcom/microblink/internal/logo/LogoRepository;

    iget-object v10, v1, Lcom/microblink/OcrResultsRunner;->context:Landroid/content/Context;

    invoke-direct {v9, v10}, Lcom/microblink/internal/logo/LogoRepository;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0}, Lcom/microblink/internal/logo/LogoRepository;->logo(Ljava/io/File;)Lcom/microblink/StringType;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v9, v0}, Lcom/microblink/internal/logo/LogoRepository;->friendlyName(Lcom/microblink/StringType;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    :try_start_4
    const-string v9, "OcrResultsRunner"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v9, v0, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    const/4 v6, 0x0

    :goto_9
    :try_start_5
    const-string v9, "OcrResultsRunner"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v9, v0, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_18
    :goto_a
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->productDetector()Lcom/microblink/ProductDetector;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lcom/microblink/ProductDetector;->foundProducts()Ljava/util/List;

    move-result-object v0

    goto :goto_b

    :cond_19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_b
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/HashSet;

    invoke-virtual {v7}, Lcom/microblink/OcrResult;->hasProducts()Z

    move-result v11

    if-eqz v11, :cond_1a

    iget-object v11, v7, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    goto :goto_c

    :cond_1a
    invoke-virtual {v2}, Lcom/microblink/Receipt;->ocrProducts()Ljava/util/List;

    move-result-object v11

    :goto_c
    invoke-direct {v10, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/microblink/internal/ProductSummary;

    if-eqz v11, :cond_1b

    invoke-virtual {v11}, Lcom/microblink/internal/ProductSummary;->product()Lcom/microblink/Product;

    move-result-object v12

    if-eqz v12, :cond_1b

    invoke-virtual {v11}, Lcom/microblink/internal/ProductSummary;->ocrProduct()Lcom/microblink/internal/OcrProduct;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_1c
    invoke-virtual {v2}, Lcom/microblink/Receipt;->clearCoupons()V

    iget-object v0, v7, Lcom/microblink/OcrResult;->discounts:[Lcom/microblink/internal/OcrDiscount;

    if-eqz v0, :cond_1d

    array-length v10, v0

    if-lez v10, :cond_1d

    array-length v10, v0

    const/4 v11, 0x0

    :goto_e
    if-ge v11, v10, :cond_1d

    aget-object v12, v0, v11

    invoke-virtual {v2, v12}, Lcom/microblink/Receipt;->addCoupon(Lcom/microblink/internal/OcrDiscount;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_1d
    invoke-virtual {v2}, Lcom/microblink/Receipt;->sortCouponsByLineNumber()V

    iget-object v0, v7, Lcom/microblink/OcrResult;->subtotalMatches:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, v7, Lcom/microblink/OcrResult;->subtotalMatches:Ljava/lang/String;

    iget v10, v7, Lcom/microblink/OcrResult;->subtotalMatchesConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->subtotalMatches(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_1e
    iget-object v0, v7, Lcom/microblink/OcrResult;->combinedRaw:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, v7, Lcom/microblink/OcrResult;->combinedRaw:Ljava/lang/String;

    iget v10, v7, Lcom/microblink/OcrResult;->combinedRawConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->combinedRaw(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_1f
    iget-object v0, v7, Lcom/microblink/OcrResult;->last4Digits:Ljava/lang/String;

    if-eqz v0, :cond_20

    iget-object v0, v7, Lcom/microblink/OcrResult;->last4Digits:Ljava/lang/String;

    iget v10, v7, Lcom/microblink/OcrResult;->last4DigitsConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->last4Digits(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_20
    iget-object v0, v7, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    if-eqz v0, :cond_21

    new-instance v0, Lcom/microblink/internal/OcrPhoneMapper;

    invoke-direct {v0}, Lcom/microblink/internal/OcrPhoneMapper;-><init>()V

    iget-object v10, v7, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    invoke-virtual {v0, v10}, Lcom/microblink/internal/OcrPhoneMapper;->transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->storePhone(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_21
    iget v0, v7, Lcom/microblink/OcrResult;->total:F

    float-to-double v10, v0

    sget-wide v12, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v0, v10, v12

    if-lez v0, :cond_22

    iget v0, v7, Lcom/microblink/OcrResult;->total:F

    iget v10, v7, Lcom/microblink/OcrResult;->totalConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->total(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_22
    iget v0, v7, Lcom/microblink/OcrResult;->subTotal:F

    float-to-double v10, v0

    sget-wide v12, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v0, v10, v12

    if-lez v0, :cond_23

    iget v0, v7, Lcom/microblink/OcrResult;->subTotal:F

    iget v10, v7, Lcom/microblink/OcrResult;->subTotalConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_23
    iget v0, v7, Lcom/microblink/OcrResult;->taxes:F

    float-to-double v10, v0

    sget-wide v12, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v0, v10, v12

    if-lez v0, :cond_24

    iget v0, v7, Lcom/microblink/OcrResult;->taxes:F

    iget v10, v7, Lcom/microblink/OcrResult;->taxesConfidence:F

    invoke-static {v0, v10}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_24
    iget-object v0, v7, Lcom/microblink/OcrResult;->longTransactionId:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, v7, Lcom/microblink/OcrResult;->longTransactionId:Ljava/lang/String;

    iget v7, v7, Lcom/microblink/OcrResult;->longTransactionIdConfidence:F

    invoke-static {v0, v7}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/microblink/Receipt;->longTransactionId(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_25
    invoke-virtual {v2}, Lcom/microblink/Receipt;->purchaseDateTime()Lcom/microblink/DateTime;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Lcom/microblink/DateTime;->date()Lcom/microblink/StringType;

    move-result-object v7

    invoke-virtual {v0}, Lcom/microblink/DateTime;->time()Lcom/microblink/StringType;

    move-result-object v0

    move-object v10, v0

    goto :goto_f

    :cond_26
    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_f
    invoke-static {v9}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    if-nez v0, :cond_27

    :try_start_6
    new-instance v0, Lcom/microblink/OcrResultsRunner$1;

    invoke-direct {v0, v1}, Lcom/microblink/OcrResultsRunner$1;-><init>(Lcom/microblink/OcrResultsRunner;)V

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_10

    :catch_3
    move-exception v0

    :try_start_7
    const-string v11, "OcrResultsRunner"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v12, v5, [Ljava/lang/Object;

    invoke-static {v11, v0, v12}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_27
    :goto_10
    new-instance v0, Lcom/microblink/Media;

    invoke-direct {v0, v8}, Lcom/microblink/Media;-><init>(Ljava/util/List;)V

    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object v11

    invoke-virtual {v8, v11}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->products(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    new-instance v9, Lcom/microblink/internal/CouponMapper;

    invoke-direct {v9}, Lcom/microblink/internal/CouponMapper;-><init>()V

    invoke-virtual {v2}, Lcom/microblink/Receipt;->coupons()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/microblink/internal/CouponMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->coupons(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v2}, Lcom/microblink/Receipt;->total()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->total(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v2}, Lcom/microblink/Receipt;->longTransactionId()Lcom/microblink/StringType;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->longTransactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v2}, Lcom/microblink/Receipt;->subTotal()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v2}, Lcom/microblink/Receipt;->taxes()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/microblink/ScanResults$Builder;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/microblink/ScanResults$Builder;->receiptDate(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/microblink/ScanResults$Builder;->receiptTime(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->last4Digits()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->last4Digits(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    const-string v8, "YES"

    invoke-virtual {v2}, Lcom/microblink/Receipt;->subtotalMatches()Lcom/microblink/StringType;

    move-result-object v9

    invoke-static {v9}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->subtotalMatches(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeNumber()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storeNumber(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->merchantName()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeAddress()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storeAddress(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storeCity(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storeState(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storeZip(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->storePhone(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->cashierId()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->cashierId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->transactionId()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->transactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->register()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->registerId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->paymentMethods()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->paymentMethods(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->blinkReceiptId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->taxId()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->taxId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->mallName()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->mallName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->ocrConfidence()F

    move-result v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->ocrConfidence(F)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->merchantSource()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->merchantSource(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->foundTopEdge()Z

    move-result v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->foundTopEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v2}, Lcom/microblink/Receipt;->foundBottomEdge()Z

    move-result v8

    invoke-virtual {v7, v8}, Lcom/microblink/ScanResults$Builder;->foundBottomEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v7

    invoke-virtual {v7}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object v7

    invoke-direct/range {p0 .. p0}, Lcom/microblink/OcrResultsRunner;->finishing()Z

    move-result v8

    if-eqz v8, :cond_28

    iget-object v8, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    invoke-interface {v8, v7, v0}, Lcom/microblink/RecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    goto :goto_12

    :cond_28
    iget-object v8, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    new-instance v9, Lcom/microblink/PreliminaryResult;

    invoke-direct {v9, v7, v0}, Lcom/microblink/PreliminaryResult;-><init>(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    invoke-interface {v8, v9}, Lcom/microblink/RecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_12

    :catch_4
    move-exception v0

    goto :goto_11

    :catch_5
    move-exception v0

    const/4 v6, 0x0

    :goto_11
    const-string v7, "OcrResultsRunner"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-static {v7, v8, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/microblink/OcrResultsRunner;->callback:Lcom/microblink/RecognizerCallback;

    new-instance v7, Ljava/lang/Exception;

    invoke-direct {v7, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v4, v7}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :goto_12
    invoke-direct/range {p0 .. p0}, Lcom/microblink/OcrResultsRunner;->finishing()Z

    move-result v0

    if-eqz v0, :cond_2a

    :try_start_8
    iget-object v0, v1, Lcom/microblink/OcrResultsRunner;->summaryStats:Lcom/microblink/SummaryStats;

    if-eqz v0, :cond_29

    iget-object v0, v1, Lcom/microblink/OcrResultsRunner;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v0}, Lcom/microblink/SummaryStats;->stop()V

    :cond_29
    new-instance v0, Lcom/microblink/SummaryRepository;

    invoke-direct {v0}, Lcom/microblink/SummaryRepository;-><init>()V

    iget-object v4, v1, Lcom/microblink/OcrResultsRunner;->summaryStats:Lcom/microblink/SummaryStats;

    new-instance v7, Lcom/microblink/OcrResultsRunner$3;

    invoke-direct {v7, v1}, Lcom/microblink/OcrResultsRunner$3;-><init>(Lcom/microblink/OcrResultsRunner;)V

    invoke-virtual {v0, v4, v2, v6, v7}, Lcom/microblink/SummaryRepository;->summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)Lcom/microblink/SummaryRepository;

    move-result-object v0

    iget-object v4, v1, Lcom/microblink/OcrResultsRunner;->context:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->externalStorage()Z

    move-result v3

    invoke-static {v4, v6, v3}, Lcom/microblink/internal/DiskUtils;->capturedFiles(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/microblink/OcrResultsRunner$2;

    invoke-direct {v4, v1}, Lcom/microblink/OcrResultsRunner$2;-><init>(Lcom/microblink/OcrResultsRunner;)V

    invoke-virtual {v0, v3, v2, v4}, Lcom/microblink/SummaryRepository;->upload(Ljava/util/List;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)Lcom/microblink/SummaryRepository;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    return-void

    :catch_6
    move-exception v0

    const-string v2, "OcrResultsRunner"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2a
    return-void
.end method
