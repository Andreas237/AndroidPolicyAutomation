.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;
.super Ljava/lang/Object;
.source "StripeManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;


# static fields
.field private static final STRIPE_ERROR_CODE_NA:I = -0x1


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final stripe:Lcom/stripe/android/Stripe;


# direct methods
.method public constructor <init>(Lcom/stripe/android/Stripe;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->stripe:Lcom/stripe/android/Stripe;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    return-object p0
.end method

.method static synthetic lambda$initStripeCustomerSession$0(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V
    .locals 0

    .line 42
    new-instance p1, Ljava/lang/String;

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;->getEphemeralKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lorg/apache/commons/codec/binary/Base64;->decodeBase64([B)[B

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([B)V

    .line 42
    invoke-interface {p2, p1}, Lcom/stripe/android/EphemeralKeyUpdateListener;->onKeyUpdate(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
    .locals 2

    .line 67
    invoke-static {p1}, Lcom/stripe/android/model/SourceParams;->createCardParams(Lcom/stripe/android/model/Card;)Lcom/stripe/android/model/SourceParams;

    move-result-object p1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->stripe:Lcom/stripe/android/Stripe;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)V

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/Stripe;->createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/SourceCallback;)V

    return-void
.end method

.method public initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
    .locals 1

    .line 41
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$StripeManagerImpl$XKZ3MRhas-CxcFoOBgo08kKqy2A;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$StripeManagerImpl$XKZ3MRhas-CxcFoOBgo08kKqy2A;-><init>(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    invoke-static {v0}, Lcom/stripe/android/CustomerSession;->initCustomerSession(Lcom/stripe/android/EphemeralKeyProvider;)V

    return-void
.end method

.method public retrieveStripeCurrentCustomer()V
    .locals 2

    .line 48
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/CustomerSession;->retrieveCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    return-void
.end method

.method public setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;

    return-void
.end method
