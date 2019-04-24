.class public final Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;
.super Ljava/lang/Object;
.source "PwiModule_ProvideStripeClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/Stripe;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->appProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->pwiVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;)",
            "Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/Stripe;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;)",
            "Lcom/stripe/android/Stripe;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->proxyProvideStripeClient(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/stripe/android/Stripe;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideStripeClient(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/stripe/android/Stripe;
    .locals 0

    .line 43
    invoke-static {p0, p1}, Lcom/ibotta/android/di/PwiModule;->provideStripeClient(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/stripe/android/Stripe;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 42
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/Stripe;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/Stripe;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->pwiVariantProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/Stripe;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->get()Lcom/stripe/android/Stripe;

    move-result-object v0

    return-object v0
.end method
