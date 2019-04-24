.class public Lcom/stripe/android/Stripe;
.super Ljava/lang/Object;
.source "Stripe.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/Stripe$TokenCreator;,
        Lcom/stripe/android/Stripe$SourceCreator;,
        Lcom/stripe/android/Stripe$ResponseWrapper;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDefaultPublishableKey:Ljava/lang/String;

.field private mLoggingResponseListener:Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;

.field mSourceCreator:Lcom/stripe/android/Stripe$SourceCreator;

.field private mStripeAccount:Ljava/lang/String;

.field mTokenCreator:Lcom/stripe/android/Stripe$TokenCreator;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Lcom/stripe/android/Stripe$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/Stripe$1;-><init>(Lcom/stripe/android/Stripe;)V

    iput-object v0, p0, Lcom/stripe/android/Stripe;->mSourceCreator:Lcom/stripe/android/Stripe$SourceCreator;

    .line 79
    new-instance v0, Lcom/stripe/android/Stripe$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/Stripe$2;-><init>(Lcom/stripe/android/Stripe;)V

    iput-object v0, p0, Lcom/stripe/android/Stripe;->mTokenCreator:Lcom/stripe/android/Stripe$TokenCreator;

    .line 132
    iput-object p1, p0, Lcom/stripe/android/Stripe;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Lcom/stripe/android/Stripe$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/Stripe$1;-><init>(Lcom/stripe/android/Stripe;)V

    iput-object v0, p0, Lcom/stripe/android/Stripe;->mSourceCreator:Lcom/stripe/android/Stripe$SourceCreator;

    .line 79
    new-instance v0, Lcom/stripe/android/Stripe$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/Stripe$2;-><init>(Lcom/stripe/android/Stripe;)V

    iput-object v0, p0, Lcom/stripe/android/Stripe;->mTokenCreator:Lcom/stripe/android/Stripe$TokenCreator;

    .line 142
    iput-object p1, p0, Lcom/stripe/android/Stripe;->mContext:Landroid/content/Context;

    .line 143
    invoke-virtual {p0, p2}, Lcom/stripe/android/Stripe;->setDefaultPublishableKey(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/Stripe;)Landroid/content/Context;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/Stripe;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300(Lcom/stripe/android/Stripe;Ljava/util/concurrent/Executor;Landroid/os/AsyncTask;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/Stripe;->executeTask(Ljava/util/concurrent/Executor;Landroid/os/AsyncTask;)V

    return-void
.end method

.method static synthetic access$400(Lcom/stripe/android/Stripe;)Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/Stripe;->mLoggingResponseListener:Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/stripe/android/Stripe;Lcom/stripe/android/Stripe$ResponseWrapper;Lcom/stripe/android/TokenCallback;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/Stripe;->tokenTaskPostExecution(Lcom/stripe/android/Stripe$ResponseWrapper;Lcom/stripe/android/TokenCallback;)V

    return-void
.end method

.method private executeTask(Ljava/util/concurrent/Executor;Landroid/os/AsyncTask;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Lcom/stripe/android/Stripe$ResponseWrapper;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 836
    new-array v0, v0, [Ljava/lang/Void;

    instance-of v1, p2, Landroid/os/AsyncTask;

    if-nez v1, :cond_0

    invoke-virtual {p2, p1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/os/AsyncTask;

    invoke-static {p2, p1, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->executeOnExecutor(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 838
    :cond_1
    new-array p1, v0, [Ljava/lang/Void;

    instance-of v0, p2, Landroid/os/AsyncTask;

    if-nez v0, :cond_2

    invoke-virtual {p2, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    check-cast p2, Landroid/os/AsyncTask;

    invoke-static {p2, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method private tokenTaskPostExecution(Lcom/stripe/android/Stripe$ResponseWrapper;Lcom/stripe/android/TokenCallback;)V
    .locals 1

    .line 824
    iget-object v0, p1, Lcom/stripe/android/Stripe$ResponseWrapper;->token:Lcom/stripe/android/model/Token;

    if-eqz v0, :cond_0

    .line 825
    iget-object p1, p1, Lcom/stripe/android/Stripe$ResponseWrapper;->token:Lcom/stripe/android/model/Token;

    invoke-interface {p2, p1}, Lcom/stripe/android/TokenCallback;->onSuccess(Lcom/stripe/android/model/Token;)V

    goto :goto_0

    .line 826
    :cond_0
    iget-object v0, p1, Lcom/stripe/android/Stripe$ResponseWrapper;->error:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    .line 827
    iget-object p1, p1, Lcom/stripe/android/Stripe$ResponseWrapper;->error:Ljava/lang/Exception;

    invoke-interface {p2, p1}, Lcom/stripe/android/TokenCallback;->onError(Ljava/lang/Exception;)V

    goto :goto_0

    .line 829
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Somehow got neither a token response or an error response"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/stripe/android/TokenCallback;->onError(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private validateKey(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            min = 0x1L
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 809
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "sk_"

    .line 815
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 816
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 810
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/SourceCallback;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/SourceCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 293
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/stripe/android/Stripe;->createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/SourceCallback;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/SourceCallback;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 6
    .param p1    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/SourceCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p3, :cond_0

    .line 309
    iget-object p3, p0, Lcom/stripe/android/Stripe;->mDefaultPublishableKey:Ljava/lang/String;

    :cond_0
    move-object v2, p3

    if-nez v2, :cond_1

    return-void

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/Stripe;->mSourceCreator:Lcom/stripe/android/Stripe$SourceCreator;

    iget-object v3, p0, Lcom/stripe/android/Stripe;->mStripeAccount:Ljava/lang/String;

    move-object v1, p1

    move-object v4, p4

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/Stripe$SourceCreator;->create(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/stripe/android/SourceCallback;)V

    return-void
.end method

.method public setDefaultPublishableKey(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            min = 0x1L
        .end annotation
    .end param

    .line 766
    invoke-direct {p0, p1}, Lcom/stripe/android/Stripe;->validateKey(Ljava/lang/String;)V

    .line 767
    iput-object p1, p0, Lcom/stripe/android/Stripe;->mDefaultPublishableKey:Ljava/lang/String;

    return-void
.end method
