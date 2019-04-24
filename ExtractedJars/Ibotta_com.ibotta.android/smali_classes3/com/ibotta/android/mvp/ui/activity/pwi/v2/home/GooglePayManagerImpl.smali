.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;
.super Ljava/lang/Object;
.source "GooglePayManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;


# static fields
.field private static final CURRENCY_CODE:Ljava/lang/String; = "USD"

.field private static final GOOGLE_PAY_GATEWAY_KEY:Ljava/lang/String; = "gateway"

.field private static final GOOGLE_PAY_GATEWAY_VALUE:Ljava/lang/String; = "stripe"

.field private static final GOOGLE_PAY_PK_KEY:Ljava/lang/String; = "stripe:publishableKey"

.field private static final STRIPE_VERSION_KEY:Ljava/lang/String; = "stripe:version"

.field private static final STRIPE_VERSION_VALUE:Ljava/lang/String; = "2018-05-21"


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/google/android/gms/wallet/PaymentsClient;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    return-void
.end method

.method private createCardRequirements()Lcom/google/android/gms/wallet/CardRequirements;
    .locals 6

    .line 99
    invoke-static {}, Lcom/google/android/gms/wallet/CardRequirements;->newBuilder()Lcom/google/android/gms/wallet/CardRequirements$Builder;

    move-result-object v0

    const/4 v1, 0x4

    new-array v2, v1, [Ljava/lang/Integer;

    const/4 v3, 0x1

    .line 101
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const/4 v4, 0x2

    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    const/4 v3, 0x5

    .line 103
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v2, v3

    .line 100
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/CardRequirements$Builder;->addAllowedCardNetworks(Ljava/util/Collection;)Lcom/google/android/gms/wallet/CardRequirements$Builder;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lcom/google/android/gms/wallet/CardRequirements$Builder;->build()Lcom/google/android/gms/wallet/CardRequirements;

    move-result-object v0

    return-object v0
.end method

.method private createTokenizationParameters()Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;
    .locals 4

    .line 109
    invoke-static {}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;->newBuilder()Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 110
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;->setPaymentMethodTokenizationType(I)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;

    move-result-object v0

    const-string v1, "gateway"

    const-string v2, "stripe"

    .line 111
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;

    move-result-object v0

    const-string v1, "stripe:publishableKey"

    new-instance v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 112
    invoke-interface {v3}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;

    move-result-object v0

    const-string v1, "stripe:version"

    const-string v2, "2018-05-21"

    .line 113
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;->build()Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    move-result-object v0

    return-object v0
.end method

.method private createTransactionInfo(D)Lcom/google/android/gms/wallet/TransactionInfo;
    .locals 2

    .line 91
    invoke-static {}, Lcom/google/android/gms/wallet/TransactionInfo;->newBuilder()Lcom/google/android/gms/wallet/TransactionInfo$Builder;

    move-result-object v0

    const/4 v1, 0x3

    .line 92
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/TransactionInfo$Builder;->setTotalPriceStatus(I)Lcom/google/android/gms/wallet/TransactionInfo$Builder;

    move-result-object v0

    .line 93
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/TransactionInfo$Builder;->setTotalPrice(Ljava/lang/String;)Lcom/google/android/gms/wallet/TransactionInfo$Builder;

    move-result-object p1

    const-string p2, "USD"

    .line 94
    invoke-virtual {p1, p2}, Lcom/google/android/gms/wallet/TransactionInfo$Builder;->setCurrencyCode(Ljava/lang/String;)Lcom/google/android/gms/wallet/TransactionInfo$Builder;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/TransactionInfo$Builder;->build()Lcom/google/android/gms/wallet/TransactionInfo;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$isReadyToPay$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;

    const-class v1, Lcom/google/android/gms/common/api/ApiException;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;->onIsReadyToPayRequest(Z)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 69
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 70
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 71
    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;->onIsReadyToPayRequest(Z)V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public createPaymentDataRequest(D)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;"
        }
    .end annotation

    .line 80
    invoke-static {}, Lcom/google/android/gms/wallet/PaymentDataRequest;->newBuilder()Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object v0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->createTransactionInfo(D)Lcom/google/android/gms/wallet/TransactionInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->setTransactionInfo(Lcom/google/android/gms/wallet/TransactionInfo;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 82
    invoke-virtual {p1, p2}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->addAllowedPaymentMethod(I)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object p1

    const/4 p2, 0x2

    .line 83
    invoke-virtual {p1, p2}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->addAllowedPaymentMethod(I)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object p1

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->createCardRequirements()Lcom/google/android/gms/wallet/CardRequirements;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->setCardRequirements(Lcom/google/android/gms/wallet/CardRequirements;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object p1

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->createTokenizationParameters()Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->setPaymentMethodTokenizationParameters(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;

    move-result-object p1

    .line 87
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->build()Lcom/google/android/gms/wallet/PaymentDataRequest;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/wallet/PaymentsClient;->loadPaymentData(Lcom/google/android/gms/wallet/PaymentDataRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public isReadyToPay()V
    .locals 2

    .line 57
    invoke-static {}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->newBuilder()Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;->addAllowedPaymentMethod(I)Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;

    move-result-object v0

    const/4 v1, 0x2

    .line 59
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;->addAllowedPaymentMethod(I)Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;->build()Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/wallet/PaymentsClient;->isReadyToPay(Lcom/google/android/gms/wallet/IsReadyToPayRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 63
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$GooglePayManagerImpl$IhSHuLd3vlZQMPQ-SCAsY3N5rcg;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$GooglePayManagerImpl$IhSHuLd3vlZQMPQ-SCAsY3N5rcg;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public setGooglePayManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;

    return-void
.end method
