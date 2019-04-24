.class public final Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideProductSummaryReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
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
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->proxyProvideProductSummaryReducer(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideProductSummaryReducer(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideProductSummaryReducer(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->get()Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object v0

    return-object v0
.end method
