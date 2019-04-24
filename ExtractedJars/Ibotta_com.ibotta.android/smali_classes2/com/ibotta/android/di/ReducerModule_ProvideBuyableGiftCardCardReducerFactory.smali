.class public final Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideBuyableGiftCardCardReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final buyableGiftCardImageReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final buyableGiftCardSummaryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final contentBackgroundReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentBackgroundReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final payAtRetailerButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentBackgroundReducer;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->buyableGiftCardImageReducerProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->buyableGiftCardSummaryReducerProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->payAtRetailerButtonReducerProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->contentBackgroundReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentBackgroundReducer;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentBackgroundReducer;",
            ">;)",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/content/ContentBackgroundReducer;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->proxyProvideBuyableGiftCardCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBuyableGiftCardCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ReducerModule;->provideBuyableGiftCardCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->buyableGiftCardImageReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->buyableGiftCardSummaryReducerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->payAtRetailerButtonReducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->contentBackgroundReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object v0

    return-object v0
.end method
