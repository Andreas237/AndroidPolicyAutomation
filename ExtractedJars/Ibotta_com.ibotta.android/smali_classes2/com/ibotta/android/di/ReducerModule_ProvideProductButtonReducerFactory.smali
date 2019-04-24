.class public final Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideProductButtonReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/card/product/ProductButtonReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final shopButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/ShopButtonReducer;",
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
            "Lcom/ibotta/android/button/ShopButtonReducer;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->shopButtonReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/ShopButtonReducer;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/ShopButtonReducer;",
            ">;)",
            "Lcom/ibotta/android/content/card/product/ProductButtonReducer;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/button/ShopButtonReducer;

    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->proxyProvideProductButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideProductButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule;->provideProductButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/card/product/ProductButtonReducer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->shopButtonReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->get()Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object v0

    return-object v0
.end method
