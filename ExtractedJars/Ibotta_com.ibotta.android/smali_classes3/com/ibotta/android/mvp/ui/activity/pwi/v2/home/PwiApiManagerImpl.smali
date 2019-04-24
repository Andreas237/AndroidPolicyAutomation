.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;
.super Ljava/lang/Object;
.source "PwiApiManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 79
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    .line 80
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 81
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 82
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 83
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 84
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    return-void
.end method

.method private getBgcTransactionFromResponse(Lcom/ibotta/api/call/pwi/BgcTransactionResponse;)Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 311
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->getBgcTransaction()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 314
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "transaction is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getBuyableGiftCardModelFromResponse(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;)Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->getBuyableGiftCard()Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 112
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "buyableGiftCardModel is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getPaymentAccountFromResponse(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 223
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object v0

    .line 225
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->isResponse404()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    return-object v0

    .line 228
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "paymentAccount is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 226
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException;-><init>()V

    throw p1
.end method

.method private getPaymentMethodFromSource(Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
    .locals 3

    .line 471
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/SourceCardData;

    .line 473
    invoke-static {}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->builder()Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v1

    .line 474
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getLast4()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->name(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v1

    .line 475
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getBrand()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->cardBrand(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v1

    .line 476
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->expiryMonth(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v1

    .line 477
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->expiryYear(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v1

    .line 478
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getFunding()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->cardType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    .line 479
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->sourceId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    .line 480
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->sourceType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object v0

    .line 481
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->defaultSource(Z)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 482
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->build()Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getAllPaymentMethodsFromCustomer$2(Lcom/stripe/android/model/CustomerSource;)Lcom/stripe/android/model/Source;
    .locals 0

    .line 375
    invoke-virtual {p0}, Lcom/stripe/android/model/CustomerSource;->asSource()Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$getAllPaymentMethodsFromCustomer$3(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Ljava/lang/String;Lcom/stripe/android/model/Source;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
    .locals 0

    .line 376
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getPaymentMethodFromSource(Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$getTransactionsFromJob$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Lcom/ibotta/android/service/api/job/HomeApiJob;Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 1

    .line 248
    invoke-virtual {p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->toBuilder()Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object v0

    .line 249
    invoke-virtual {p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getOptionalRetailerModelWithRetailerIdFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;->retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object p1

    .line 250
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;->build()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$getTransactionsFromJob$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 0

    .line 277
    invoke-virtual {p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->toBuilder()Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object p2

    .line 278
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getBuyableGiftCardModelFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;->retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object p1

    .line 279
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;->build()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;->buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V

    return-void
.end method

.method public buildPaymentAccountsDeleteCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 413
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;-><init>()V

    .line 414
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;->setSourceToken(Ljava/lang/String;)V

    .line 416
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;-><init>(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;I)V

    invoke-direct {p1, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p1
.end method

.method public buildPaymentAccountsPutCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 421
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;-><init>()V

    .line 422
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;->setSourceToken(Ljava/lang/String;)V

    .line 424
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall;-><init>(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;I)V

    invoke-direct {p1, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p1
.end method

.method public buildTransactionByIdJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;
    .locals 3

    .line 429
    new-instance v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 430
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;-><init>(ILjava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;-><init>(Lcom/ibotta/api/ApiCall;Z)V

    return-object v0
.end method

.method public buildTransactionPollingJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;
    .locals 3

    .line 435
    new-instance v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 436
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;-><init>(ILjava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;-><init>(Lcom/ibotta/api/ApiCall;Z)V

    return-object v0
.end method

.method public buildTransactionPostJob(Lcom/ibotta/api/model/BuyableGiftCardModel;DLjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 389
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;-><init>()V

    .line 390
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getCacheKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setGiftCardId(Ljava/lang/String;)V

    .line 391
    invoke-virtual {v0, p2, p3}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setFaceValue(D)V

    .line 392
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v1, p1}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setSku(Ljava/lang/String;)V

    .line 393
    invoke-virtual {v0, p4}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setUuid(Ljava/lang/String;)V

    .line 394
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setRetailerName(Ljava/lang/String;)V

    .line 395
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 396
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {p4, p2, p3, v1, v2}, Lcom/ibotta/android/util/Formatting;->rewardAmountNoDollarSign(DD)Ljava/lang/String;

    move-result-object p2

    .line 395
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setRewardAmount(Ljava/lang/String;)V

    .line 397
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setRetailerId(I)V

    .line 399
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl$1;->$SwitchMap$com$ibotta$api$call$pwi$BgcPostTransactionCall$CallParams$StripePaymentType:[I

    invoke-virtual {p6}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 404
    :pswitch_0
    new-instance p1, Ljava/lang/String;

    const-string p2, "UTF-8"

    invoke-virtual {p5, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setPaymentSourceId(Ljava/lang/String;)V

    goto :goto_0

    .line 401
    :pswitch_1
    new-instance p1, Ljava/lang/String;

    const-string p2, "UTF-8"

    invoke-virtual {p5, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->setPaymentTokenId(Ljava/lang/String;)V

    .line 408
    :goto_0
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance p2, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;

    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result p3

    invoke-direct {p2, v0, p3}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;-><init>(Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;I)V

    invoke-direct {p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public buildTransactionSpentJob(Ljava/lang/String;Z)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 3

    .line 487
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;-><init>()V

    .line 488
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->setSpent(Z)V

    .line 490
    new-instance p2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v0, v2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;-><init>(Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;ILjava/lang/String;)V

    invoke-direct {p2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p2
.end method

.method public buildTransactionUpdateBalanceJob(Ljava/lang/String;D)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 4

    .line 495
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;-><init>()V

    const-wide/16 v1, 0x0

    cmpg-double v3, p2, v1

    if-gtz v3, :cond_0

    const/4 p2, 0x1

    .line 498
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->setSpent(Z)V

    goto :goto_0

    .line 500
    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;->setUpdatedBalance(Ljava/lang/Double;)V

    .line 503
    :goto_0
    new-instance p2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance p3, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-direct {p3, v0, v1, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;-><init>(Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;ILjava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p2
.end method

.method public clearWalletCaches(I)V
    .locals 4

    .line 459
    new-instance v0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 460
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 461
    invoke-interface {v2}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v2

    sget-object v3, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->COMPLETED_STATUS:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;-><init>(IZLjava/util/Set;)V

    .line 463
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v1, v0}, Lcom/ibotta/android/appcache/AppCache;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V

    .line 466
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->setRetailerId(Ljava/lang/Integer;)V

    .line 467
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {p1, v0}, Lcom/ibotta/android/appcache/AppCache;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V

    return-void
.end method

.method public getAllPaymentMethodsFromCustomer(Lcom/stripe/android/model/Customer;)Ljava/util/List;
    .locals 2
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/Customer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 368
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 371
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getSources()Ljava/util/List;

    move-result-object v0

    .line 372
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getDefaultSource()Ljava/lang/String;

    move-result-object p1

    .line 374
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$puMk2B-3DJaOQRbiohXdWyPtc_A;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$puMk2B-3DJaOQRbiohXdWyPtc_A;

    .line 375
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$4lnpANxX99zG8Rc8_9F4HrDBiA4;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$4lnpANxX99zG8Rc8_9F4HrDBiA4;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Ljava/lang/String;)V

    .line 376
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 377
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getBuyableGiftCardModelFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 98
    instance-of v0, p1, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    if-eqz v0, :cond_0

    .line 99
    check-cast p1, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getBuyableGiftCardModelFromResponse(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;)Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object p1

    return-object p1

    .line 101
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "giftCardJob\'s response is not a BuyableGiftCardGraphQlResponse!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "giftCardJob is null!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getBuyableGiftCardModelsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;
    .locals 2
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 121
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 127
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 129
    instance-of v1, p1, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;

    if-eqz v1, :cond_0

    .line 130
    check-cast p1, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;->getBuyableGiftCardModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0

    .line 132
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "buyableGiftCardsJob\'s response is not a BuyableGiftCardsGraphQlResponse!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "buyableGiftCardsJob is null!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDefaultPaymentMethodFromCustomer(Lcom/stripe/android/model/Customer;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;
        }
    .end annotation

    .line 345
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getDefaultSource()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Customer;->getSourceById(Ljava/lang/String;)Lcom/stripe/android/model/CustomerSource;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 350
    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->asSource()Lcom/stripe/android/model/Source;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 355
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getDefaultSource()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getPaymentMethodFromSource(Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 358
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "pwiStripePaymentMethod is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 352
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "defaultSource is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 347
    :cond_2
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;

    const-string v0, "defaultCustomerSource is null! User has a customer account, but no sources!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getOptionalRetailerModelWithRetailerIdFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;I)Lcom/ibotta/api/model/RetailerModel;
    .locals 4
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_2

    .line 147
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 149
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-eqz v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    if-nez p1, :cond_0

    .line 157
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Optional retailerModel is null for retailerId: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 158
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/NoRetailerException;

    invoke-direct {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/NoRetailerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_0
    return-object p1

    .line 152
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "homeJob\'s response is not a HomeResponse!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 144
    :cond_2
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "homeJob is null!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getPaymentAccountFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .locals 4
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException;,
            Ljava/lang/IllegalStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 205
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 207
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    if-eqz v0, :cond_0

    .line 208
    check-cast p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getPaymentAccountFromResponse(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object p1

    return-object p1

    .line 209
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v0, :cond_1

    .line 210
    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    .line 212
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IGC Error with http response code of: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;)V

    throw v1

    .line 214
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "paymentAccountJob\'s response is not a BgcPaymentAccountsResponse or PwiErrorResponse!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_2
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "paymentAccountJob is null!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getPwiRetailersFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .locals 3
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 190
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getRetailerModelsFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 191
    invoke-virtual {v2}, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->getPwiRetailers()Ljava/util/Set;

    move-result-object v2

    .line 189
    invoke-interface {v1, p1, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getRetailerModelsFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .locals 2
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 173
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 175
    instance-of v1, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-eqz v1, :cond_0

    .line 176
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0

    .line 178
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "homeJob\'s response is not a HomeResponse!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 170
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "homeJob is null!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 1
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 297
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 299
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    if-eqz v0, :cond_0

    .line 300
    check-cast p1, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getBgcTransactionFromResponse(Lcom/ibotta/api/call/pwi/BgcTransactionResponse;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    return-object p1

    .line 302
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "transactionJob\'s response is not a BgcTransactionResponse!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 294
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v0, "transactionJob is null!"

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 243
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 245
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    if-eqz v0, :cond_0

    .line 247
    check-cast p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;->getBgcTransactions()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$zntNJgiZ347tSuxN_7EMcTNrlDc;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$zntNJgiZ347tSuxN_7EMcTNrlDc;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Lcom/ibotta/android/service/api/job/HomeApiJob;)V

    .line 248
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 251
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 253
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "transactionsJob\'s response is not a BuyableGiftCardsResponse!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 240
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "transactionsJob is null!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 272
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 274
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    if-eqz v0, :cond_0

    .line 276
    check-cast p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;->getBgcTransactions()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$Fr1IyD9ZplVrgEHZ9ch9ya49Ku4;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiApiManagerImpl$Fr1IyD9ZplVrgEHZ9ch9ya49Ku4;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 277
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 280
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 282
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "transactionsJob\'s response is not a BuyableGiftCardsResponse!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 269
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string p2, "transactionsJob is null!"

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;->initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    return-void
.end method

.method public isFailedTransaction(Lcom/ibotta/android/service/api/job/SingleApiJob;)Z
    .locals 0

    .line 441
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isFailedTransaction(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public retrieveStripeCurrentCustomer()V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;->retrieveStripeCurrentCustomer()V

    return-void
.end method

.method public setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->stripeManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;->setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V

    return-void
.end method

.method public updateCacheOnSuccessfulPurchase(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 447
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    .line 450
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/appcache/AppCache;->updateBgcTransactionById(ILcom/ibotta/api/call/pwi/BgcTransactionResponse;)V

    .line 453
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->getBgcTransaction()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;->clearWalletCaches(I)V

    return-void
.end method
