.class public Lcom/stripe/android/CustomerSession;
.super Ljava/lang/Object;
.source "CustomerSession.java"

# interfaces
.implements Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/CustomerSession$StripeApiProxy;,
        Lcom/stripe/android/CustomerSession$SourceRetrievalListener;,
        Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
    }
.end annotation


# static fields
.field private static final CUSTOMER_CACHE_DURATION_MILLISECONDS:J

.field private static final KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

.field private static final VALID_TOKENS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mInstance:Lcom/stripe/android/CustomerSession;


# instance fields
.field private mCachedContextReference:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private mCustomer:Lcom/stripe/android/model/Customer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mCustomerCacheTime:J

.field private mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mEphemeralKey:Lcom/stripe/android/EphemeralKey;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private mProductUsageTokens:Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mProxyNowCalendar:Ljava/util/Calendar;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mStripeApiProxy:Lcom/stripe/android/CustomerSession$StripeApiProxy;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mThreadPoolExecutor:Ljava/util/concurrent/ThreadPoolExecutor;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mUiThreadHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 56
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "AddSourceActivity"

    const-string v2, "PaymentMethodsActivity"

    const-string v3, "PaymentFlowActivity"

    const-string v4, "PaymentSession"

    const-string v5, "ShippingInfoScreen"

    const-string v6, "ShippingMethodScreen"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    .line 57
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/stripe/android/CustomerSession;->VALID_TOKENS:Ljava/util/Set;

    .line 95
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sput-object v0, Lcom/stripe/android/CustomerSession;->KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

    .line 98
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/CustomerSession;->CUSTOMER_CACHE_DURATION_MILLISECONDS:J

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/CustomerSession$StripeApiProxy;Ljava/util/Calendar;)V
    .locals 6
    .param p1    # Lcom/stripe/android/EphemeralKeyProvider;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Calendar;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;

    .line 157
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->createThreadPoolExecutor()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mThreadPoolExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 158
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->createMainThreadHandler()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mUiThreadHandler:Landroid/os/Handler;

    .line 159
    iput-object p2, p0, Lcom/stripe/android/CustomerSession;->mStripeApiProxy:Lcom/stripe/android/CustomerSession$StripeApiProxy;

    .line 160
    iput-object p3, p0, Lcom/stripe/android/CustomerSession;->mProxyNowCalendar:Ljava/util/Calendar;

    .line 161
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    .line 162
    new-instance p2, Lcom/stripe/android/EphemeralKeyManager;

    const-wide/16 v3, 0x1e

    move-object v0, p2

    move-object v1, p1

    move-object v2, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/EphemeralKeyManager;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;JLjava/util/Calendar;)V

    iput-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$StripeApiProxy;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mStripeApiProxy:Lcom/stripe/android/CustomerSession$StripeApiProxy;

    return-object p0
.end method

.method static synthetic access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mUiThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/stripe/android/CustomerSession;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$202(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$300(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/model/Customer;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    return-object p0
.end method

.method static synthetic access$302(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/Customer;)Lcom/stripe/android/model/Customer;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    return-object p1
.end method

.method static synthetic access$402(Lcom/stripe/android/CustomerSession;J)J
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/stripe/android/CustomerSession;->mCustomerCacheTime:J

    return-wide p1
.end method

.method static synthetic access$500(Lcom/stripe/android/CustomerSession;)Ljava/util/Calendar;
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->getCalendarInstance()Ljava/util/Calendar;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    return-object p0
.end method

.method static synthetic access$602(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    return-object p1
.end method

.method static synthetic access$700(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/CustomerSession;->mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    return-object p0
.end method

.method static synthetic access$702(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    return-object p1
.end method

.method private addCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 8
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 333
    new-instance v7, Lcom/stripe/android/CustomerSession$1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/CustomerSession$1;-><init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    invoke-direct {p0, v7}, Lcom/stripe/android/CustomerSession;->executeRunnable(Ljava/lang/Runnable;)V

    return-void
.end method

.method static addCustomerSourceWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Source;
    .locals 8
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/CustomerSession$StripeApiProxy;",
            ")",
            "Lcom/stripe/android/model/Source;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/StripeException;
        }
    .end annotation

    if-eqz p5, :cond_0

    .line 648
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 649
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    .line 650
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    .line 654
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v7

    move-object v0, p5

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 647
    invoke-interface/range {v0 .. v7}, Lcom/stripe/android/CustomerSession$StripeApiProxy;->addCustomerSourceWithKey(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0

    .line 657
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 658
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v1

    .line 659
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 663
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 656
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/StripeApiHandler;->addCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private canUseCachedCustomer()Z
    .locals 5

    .line 359
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->getCalendarInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    .line 360
    iget-object v2, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/stripe/android/CustomerSession;->mCustomerCacheTime:J

    sub-long/2addr v0, v2

    sget-wide v2, Lcom/stripe/android/CustomerSession;->CUSTOMER_CACHE_DURATION_MILLISECONDS:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private createMainThreadHandler()Landroid/os/Handler;
    .locals 2

    .line 556
    new-instance v0, Lcom/stripe/android/CustomerSession$6;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/CustomerSession$6;-><init>(Lcom/stripe/android/CustomerSession;Landroid/os/Looper;)V

    return-object v0
.end method

.method private createThreadPoolExecutor()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 8

    .line 626
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Lcom/stripe/android/CustomerSession;->KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lcom/stripe/android/CustomerSession;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;

    const/4 v1, 0x3

    const/4 v2, 0x3

    const-wide/16 v3, 0x2

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    return-object v7
.end method

.method private deleteCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKey;
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
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 369
    new-instance v6, Lcom/stripe/android/CustomerSession$2;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/CustomerSession$2;-><init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;)V

    .line 389
    invoke-direct {p0, v6}, Lcom/stripe/android/CustomerSession;->executeRunnable(Ljava/lang/Runnable;)V

    return-void
.end method

.method static deleteCustomerSourceWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Source;
    .locals 7
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/CustomerSession$StripeApiProxy;",
            ")",
            "Lcom/stripe/android/model/Source;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/StripeException;
        }
    .end annotation

    if-eqz p4, :cond_0

    .line 676
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 677
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    .line 678
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    .line 681
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v6

    move-object v0, p4

    move-object v4, p2

    move-object v5, p3

    .line 675
    invoke-interface/range {v0 .. v6}, Lcom/stripe/android/CustomerSession$StripeApiProxy;->deleteCustomerSourceWithKey(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0

    .line 684
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 685
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v1

    .line 686
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 689
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v3, p2

    move-object v4, p3

    .line 683
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/StripeApiHandler;->deleteCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private executeRunnable(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 474
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mStripeApiProxy:Lcom/stripe/android/CustomerSession$StripeApiProxy;

    if-eqz v0, :cond_0

    .line 475
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 479
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mThreadPoolExecutor:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private getCalendarInstance()Ljava/util/Calendar;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 636
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mProxyNowCalendar:Ljava/util/Calendar;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static getInstance()Lcom/stripe/android/CustomerSession;
    .locals 2

    .line 119
    sget-object v0, Lcom/stripe/android/CustomerSession;->mInstance:Lcom/stripe/android/CustomerSession;

    if-eqz v0, :cond_0

    return-object v0

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to get instance of CustomerSession without initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initCustomerSession(Lcom/stripe/android/EphemeralKeyProvider;)V
    .locals 1
    .param p0    # Lcom/stripe/android/EphemeralKeyProvider;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 109
    invoke-static {p0, v0, v0}, Lcom/stripe/android/CustomerSession;->initCustomerSession(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/CustomerSession$StripeApiProxy;Ljava/util/Calendar;)V

    return-void
.end method

.method static initCustomerSession(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/CustomerSession$StripeApiProxy;Ljava/util/Calendar;)V
    .locals 1
    .param p0    # Lcom/stripe/android/EphemeralKeyProvider;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/Calendar;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 141
    new-instance v0, Lcom/stripe/android/CustomerSession;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/CustomerSession;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/CustomerSession$StripeApiProxy;Ljava/util/Calendar;)V

    sput-object v0, Lcom/stripe/android/CustomerSession;->mInstance:Lcom/stripe/android/CustomerSession;

    return-void
.end method

.method static retrieveCustomerWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Customer;
    .locals 0
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Lcom/stripe/android/CustomerSession$StripeApiProxy;",
            ")",
            "Lcom/stripe/android/model/Customer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/StripeException;
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 767
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p0, p1}, Lcom/stripe/android/CustomerSession$StripeApiProxy;->retrieveCustomerWithKey(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0

    .line 770
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object p0

    .line 771
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object p1

    .line 769
    invoke-static {p0, p1}, Lcom/stripe/android/StripeApiHandler;->retrieveCustomer(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method static sendErrorIntent(Ljava/lang/ref/WeakReference;Lcom/stripe/android/exception/StripeException;)V
    .locals 2
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/exception/StripeException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/exception/StripeException;",
            ")V"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 778
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 781
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "exception"

    .line 782
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 783
    new-instance p1, Landroid/content/Intent;

    const-string v1, "action_api_exception"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 784
    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 785
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method static setCustomerShippingInfoWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Customer;
    .locals 7
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/model/ShippingInformation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/ShippingInformation;",
            "Lcom/stripe/android/CustomerSession$StripeApiProxy;",
            ")",
            "Lcom/stripe/android/model/Customer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/StripeException;
        }
    .end annotation

    if-eqz p4, :cond_0

    .line 702
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 703
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    .line 704
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    .line 707
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v6

    move-object v0, p4

    move-object v4, p2

    move-object v5, p3

    .line 701
    invoke-interface/range {v0 .. v6}, Lcom/stripe/android/CustomerSession$StripeApiProxy;->setCustomerShippingInfoWithKey(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0

    .line 710
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 711
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v1

    .line 712
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 715
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v3, p2

    move-object v4, p3

    .line 709
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/StripeApiHandler;->setCustomerShippingInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method private setCustomerShippingInformation(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/model/ShippingInformation;
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
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Lcom/stripe/android/model/ShippingInformation;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 427
    new-instance v6, Lcom/stripe/android/CustomerSession$4;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/CustomerSession$4;-><init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;)V

    .line 447
    invoke-direct {p0, v6}, Lcom/stripe/android/CustomerSession;->executeRunnable(Ljava/lang/Runnable;)V

    return-void
.end method

.method private setCustomerSourceDefault(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 8
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 398
    new-instance v7, Lcom/stripe/android/CustomerSession$3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/CustomerSession$3;-><init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    invoke-direct {p0, v7}, Lcom/stripe/android/CustomerSession;->executeRunnable(Ljava/lang/Runnable;)V

    return-void
.end method

.method static setCustomerSourceDefaultWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Customer;
    .locals 8
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/CustomerSession$StripeApiProxy;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/CustomerSession$StripeApiProxy;",
            ")",
            "Lcom/stripe/android/model/Customer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/StripeException;
        }
    .end annotation

    if-eqz p5, :cond_0

    .line 729
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 730
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    .line 731
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    .line 735
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v7

    move-object v0, p5

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 728
    invoke-interface/range {v0 .. v7}, Lcom/stripe/android/CustomerSession$StripeApiProxy;->setDefaultCustomerSourceWithKey(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0

    .line 738
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 739
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v1

    .line 740
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 744
    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 737
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/StripeApiHandler;->setDefaultCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method private updateCustomer(Lcom/stripe/android/EphemeralKey;)V
    .locals 1
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 451
    new-instance v0, Lcom/stripe/android/CustomerSession$5;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/CustomerSession$5;-><init>(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/EphemeralKey;)V

    .line 468
    invoke-direct {p0, v0}, Lcom/stripe/android/CustomerSession;->executeRunnable(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public addCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
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
    .param p4    # Lcom/stripe/android/CustomerSession$SourceRetrievalListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 234
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    .line 235
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "source"

    .line 236
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "source_type"

    .line 237
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    iput-object p4, p0, Lcom/stripe/android/CustomerSession;->mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    .line 239
    iget-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    const-string p3, "add_source"

    invoke-virtual {p2, p3, p1}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public addProductUsageTokenIfValid(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/RestrictTo;
        value = {
            .enum Landroid/support/annotation/RestrictTo$Scope;->LIBRARY:Landroid/support/annotation/RestrictTo$Scope;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 171
    sget-object v0, Lcom/stripe/android/CustomerSession;->VALID_TOKENS:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public getCachedCustomer()Lcom/stripe/android/model/Customer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 214
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->canUseCachedCustomer()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onKeyError(ILjava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 543
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 544
    invoke-interface {v0, p1, p2}, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;->onError(ILjava/lang/String;)V

    .line 545
    iput-object v1, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    if-eqz v0, :cond_1

    .line 549
    invoke-interface {v0, p1, p2}, Lcom/stripe/android/CustomerSession$SourceRetrievalListener;->onError(ILjava/lang/String;)V

    .line 550
    iput-object v1, p0, Lcom/stripe/android/CustomerSession;->mSourceRetrievalListener:Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    :cond_1
    return-void
.end method

.method public onKeyUpdate(Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .param p1    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 487
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    .line 488
    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    .line 490
    invoke-direct {p0, p1}, Lcom/stripe/android/CustomerSession;->updateCustomer(Lcom/stripe/android/EphemeralKey;)V

    goto/16 :goto_0

    :cond_0
    const-string p1, "add_source"

    .line 491
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    if-eqz p3, :cond_1

    const-string p1, "source"

    .line 494
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "source_type"

    .line 495
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 496
    iget-object v1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    const-string p1, "source"

    .line 499
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    const-string p1, "source_type"

    .line 500
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/util/ArrayList;

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, p0

    .line 496
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/CustomerSession;->addCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 502
    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    goto/16 :goto_0

    :cond_1
    const-string p1, "delete_source"

    .line 503
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    const-string p1, "source"

    .line 506
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 507
    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    iget-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    const-string v0, "source"

    .line 510
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 507
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/CustomerSession;->deleteCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/List;)V

    .line 512
    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    goto/16 :goto_0

    :cond_2
    const-string p1, "default_source"

    .line 513
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_3

    if-eqz p3, :cond_3

    const-string p1, "source"

    .line 516
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "source_type"

    .line 517
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 518
    iget-object v1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    const-string p1, "source"

    .line 521
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    const-string p1, "source_type"

    .line 522
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/util/ArrayList;

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, p0

    .line 518
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/CustomerSession;->setCustomerSourceDefault(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 524
    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    goto :goto_0

    :cond_3
    const-string p1, "set_shipping_info"

    .line 525
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_4

    if-eqz p3, :cond_4

    const-string p1, "shipping_info"

    .line 528
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 529
    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    iget-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    const-string v0, "shipping_info"

    .line 532
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/model/ShippingInformation;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 529
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/CustomerSession;->setCustomerShippingInformation(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;)V

    .line 534
    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    :cond_4
    :goto_0
    return-void
.end method

.method resetUsageTokens()V
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/stripe/android/CustomerSession;->mProductUsageTokens:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public retrieveCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .locals 1
    .param p1    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 185
    invoke-direct {p0}, Lcom/stripe/android/CustomerSession;->canUseCachedCustomer()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession;->getCachedCustomer()Lcom/stripe/android/model/Customer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;->onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 188
    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    .line 189
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    .line 190
    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    invoke-virtual {p1, v0, v0}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public setCustomerDefaultSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
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
    .param p4    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 288
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    .line 289
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "source"

    .line 290
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "source_type"

    .line 291
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    iput-object p4, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    .line 293
    iget-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    const-string p3, "default_source"

    invoke-virtual {p2, p3, p1}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public setCustomerShippingInformation(Landroid/content/Context;Lcom/stripe/android/model/ShippingInformation;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/model/ShippingInformation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 269
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mCachedContextReference:Ljava/lang/ref/WeakReference;

    .line 270
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "shipping_info"

    .line 271
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    iget-object p2, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    const-string v0, "set_shipping_info"

    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public updateCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .locals 1
    .param p1    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 201
    iput-object v0, p0, Lcom/stripe/android/CustomerSession;->mCustomer:Lcom/stripe/android/model/Customer;

    .line 202
    iput-object p1, p0, Lcom/stripe/android/CustomerSession;->mCustomerRetrievalListener:Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    .line 203
    iget-object p1, p0, Lcom/stripe/android/CustomerSession;->mEphemeralKeyManager:Lcom/stripe/android/EphemeralKeyManager;

    invoke-virtual {p1, v0, v0}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
