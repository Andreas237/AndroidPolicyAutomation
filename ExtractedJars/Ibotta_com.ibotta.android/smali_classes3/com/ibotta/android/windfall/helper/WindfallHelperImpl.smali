.class public Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;
.super Ljava/lang/Object;
.source "WindfallHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/windfall/helper/WindfallHelper;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final FINAL_SIGNATURE_FORMAT:Ljava/lang/String; = "%1$s:%2$s:%3$s:%4$s"

.field public static final OCR_SOURCE:Ljava/lang/String; = "Windfall"

.field private static final PURCHASE_DATE_FORMAT:Ljava/lang/String; = "MM/dd/yyy HH:mm"

.field private static final SIGNING_ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final SIGNING_METHOD:Ljava/lang/String; = "HmacSHA256"

.field private static final STRING_TO_SIGN_FORMAT:Ljava/lang/String; = "%1$s:%2$s:%3$s"


# instance fields
.field private final apiContext:Lcom/ibotta/api/ApiContext;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 74
    iput-object p3, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 75
    iput-object p4, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->apiContext:Lcom/ibotta/api/ApiContext;

    .line 76
    iput-object p5, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 77
    iput-object p6, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    .line 78
    iput-object p7, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method

.method private encode(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "%1$s:%2$s:%3$s"

    const/4 v1, 0x3

    .line 214
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    const-string p2, "HmacSHA256"

    .line 217
    invoke-static {p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p2

    .line 218
    new-instance p3, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getSecret()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "HmacSHA256"

    invoke-direct {p3, v0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 219
    invoke-virtual {p2, p3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 221
    new-instance p3, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Hex;->encodeHex([B)[C

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to HmacSHA256 encode String."

    .line 223
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p3, 0x0

    :goto_0
    return-object p3
.end method

.method private getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 238
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$pW8mplmUMG504FeyuuQJ3h5YWFg;->INSTANCE:Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$pW8mplmUMG504FeyuuQJ3h5YWFg;

    .line 239
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    .line 240
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private getPurchaseDate(Lcom/microblink/StringType;Lcom/microblink/StringType;)Ljava/lang/String;
    .locals 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 252
    invoke-direct {p0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p1

    .line 253
    invoke-direct {p0, p2}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p2

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 259
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    .line 261
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "MM/dd/yyy HH:mm"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 268
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to produce a purchaseDate from: receiptDate=%1$s, receiptTime=%2$s"

    const/4 v3, 0x2

    .line 270
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 278
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1, v1}, Lcom/ibotta/android/util/Formatting;->formatDateAsISO8601(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_1
    return-object v1
.end method

.method private getRetailerName(Lcom/microblink/Retailer;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 245
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$FcMPgXSGn3U3Ub-PdlCHnzAdYzE;->INSTANCE:Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$FcMPgXSGn3U3Ub-PdlCHnzAdYzE;

    .line 246
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    .line 247
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private getString(Lcom/microblink/StringType;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 231
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$4bXEqCR7uF-bVJjLbm3uZPFv-UY;->INSTANCE:Lcom/ibotta/android/windfall/helper/-$$Lambda$WindfallHelperImpl$4bXEqCR7uF-bVJjLbm3uZPFv-UY;

    .line 232
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    .line 233
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method static synthetic lambda$getFloatAsString$1(Lcom/microblink/FloatType;)Ljava/lang/String;
    .locals 0

    .line 239
    invoke-virtual {p0}, Lcom/microblink/FloatType;->value()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getRetailerName$2(Lcom/microblink/Retailer;)Ljava/lang/String;
    .locals 0

    .line 246
    invoke-virtual {p0}, Lcom/microblink/Retailer;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getString$0(Lcom/microblink/StringType;)Ljava/lang/String;
    .locals 0

    .line 232
    invoke-virtual {p0}, Lcom/microblink/StringType;->value()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public convertScanResults(Lcom/microblink/ScanResults;)Lcom/ibotta/android/windfall/WindfallResults;
    .locals 5

    .line 83
    new-instance v0, Lcom/ibotta/android/windfall/WindfallResults;

    invoke-direct {v0}, Lcom/ibotta/android/windfall/WindfallResults;-><init>()V

    .line 85
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->retailerId()Lcom/microblink/Retailer;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getRetailerName(Lcom/microblink/Retailer;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setRetailerId(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->total()Lcom/microblink/FloatType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setTotal(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->subtotal()Lcom/microblink/FloatType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setSubtotal(Ljava/lang/String;)V

    .line 88
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->taxes()Lcom/microblink/FloatType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setTaxes(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->receiptDate()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setReceiptDate(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->receiptTime()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setReceiptTime(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->receiptDate()Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/ScanResults;->receiptTime()Lcom/microblink/StringType;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getPurchaseDate(Lcom/microblink/StringType;Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setPurchaseDate(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storeNumber()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreNumber(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->merchantName()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreName(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storeAddress()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreAddress(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storeCity()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreCity(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storeState()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreState(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storeZip()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStoreZip(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->storePhone()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setStorePhone(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->cashierId()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setCashierId(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->transactionId()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setTransactionId(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->registerId()Lcom/microblink/StringType;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setRegisterId(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->blinkReceiptId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setWindfallReceiptId(Ljava/lang/String;)V

    .line 106
    invoke-static {}, Lcom/microblink/ReceiptSdk;->versionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/windfall/WindfallResults;->setWindfallVersion(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->products()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 110
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/Product;

    .line 111
    new-instance v3, Lcom/ibotta/android/windfall/WindfallProduct;

    invoke-direct {v3}, Lcom/ibotta/android/windfall/WindfallProduct;-><init>()V

    .line 113
    invoke-virtual {v2}, Lcom/microblink/Product;->productNumber()Lcom/microblink/StringType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setProductNumber(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v2}, Lcom/microblink/Product;->description()Lcom/microblink/StringType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setProductDescription(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v2}, Lcom/microblink/Product;->quantity()Lcom/microblink/FloatType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setProductQuantity(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v2}, Lcom/microblink/Product;->totalPrice()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setProductPrice(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v2}, Lcom/microblink/Product;->unitOfMeasure()Lcom/microblink/StringType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getString(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setUnitOfMeasure(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v2}, Lcom/microblink/Product;->quantity()Lcom/microblink/FloatType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setUnitQuantity(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v2}, Lcom/microblink/Product;->unitPrice()Lcom/microblink/FloatType;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/windfall/WindfallProduct;->setUnitPrice(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2}, Lcom/microblink/Product;->fullPrice()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/windfall/WindfallProduct;->setFullPrice(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v0}, Lcom/ibotta/android/windfall/WindfallResults;->getProducts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {p1}, Lcom/microblink/ScanResults;->coupons()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 128
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/Coupon;

    .line 129
    new-instance v2, Lcom/ibotta/android/windfall/WindfallCoupon;

    invoke-direct {v2}, Lcom/ibotta/android/windfall/WindfallCoupon;-><init>()V

    .line 131
    invoke-virtual {v1}, Lcom/microblink/Coupon;->amount()Lcom/microblink/FloatType;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->getFloatAsString(Lcom/microblink/FloatType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/windfall/WindfallCoupon;->setCouponAmount(Ljava/lang/String;)V

    .line 132
    invoke-virtual {v1}, Lcom/microblink/Coupon;->typeToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/windfall/WindfallCoupon;->setCouponType(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0}, Lcom/ibotta/android/windfall/WindfallResults;->getCoupons()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public createVerificationCallIfNeeded(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/api/windfall/WindfallResultsResponse;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;
    .locals 2

    .line 196
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isDeviceOcrPreverify()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;-><init>()V

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setCustomerId(I)V

    .line 199
    iget-object v1, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    invoke-interface {v1}, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;->getSubmissionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setSubmissionId(Ljava/lang/String;)V

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setRetailerId(I)V

    const-string p1, "Windfall"

    .line 201
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setSource(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p2}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->getWindfallResultsJson()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setData(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p2}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->getWindfallResultsSignature()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->setSignature(Ljava/lang/String;)V

    .line 205
    new-instance p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;-><init>(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public saveWindfallResultsForLater(Lcom/microblink/ScanResults;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;
    .locals 2

    .line 171
    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->convertScanResults(Lcom/microblink/ScanResults;)Lcom/ibotta/android/windfall/WindfallResults;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->toJson(Lcom/ibotta/android/windfall/WindfallResults;)Ljava/lang/String;

    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->sign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 174
    new-instance v1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    invoke-direct {v1}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;-><init>()V

    .line 175
    invoke-virtual {v1, p1}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->setWindfallResultsJson(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v1, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->setWindfallResultsSignature(Ljava/lang/String;)V

    .line 178
    iget-object p1, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v0, Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-direct {v0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;-><init>()V

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/appcache/AppCache;->put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-object v1
.end method

.method public sign(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 158
    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->encode(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "%1$s:%2$s:%3$s:%4$s"

    const/4 v3, 0x4

    .line 160
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object p1, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lcom/ibotta/android/windfall/WindfallResults;)Ljava/lang/String;
    .locals 2

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v0, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to convert WindfallResults to JSON."

    const/4 v1, 0x0

    .line 148
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
