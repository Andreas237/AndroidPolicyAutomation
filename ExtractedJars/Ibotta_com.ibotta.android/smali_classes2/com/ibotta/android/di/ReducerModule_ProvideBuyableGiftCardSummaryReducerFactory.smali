.class public final Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
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
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;"
        }
    .end annotation

    .line 35
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    .line 34
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->proxyProvideBuyableGiftCardSummaryReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBuyableGiftCardSummaryReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideBuyableGiftCardSummaryReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 46
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object v0

    return-object v0
.end method
