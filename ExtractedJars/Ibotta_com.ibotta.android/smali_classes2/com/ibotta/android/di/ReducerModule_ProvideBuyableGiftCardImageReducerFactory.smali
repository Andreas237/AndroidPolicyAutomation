.class public final Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideBuyableGiftCardImageReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->proxyProvideBuyableGiftCardImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBuyableGiftCardImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
    .locals 1

    .line 40
    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule;->provideBuyableGiftCardImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 39
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->get()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object v0

    return-object v0
.end method
