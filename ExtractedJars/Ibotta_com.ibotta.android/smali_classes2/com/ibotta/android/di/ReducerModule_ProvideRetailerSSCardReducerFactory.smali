.class public final Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideRetailerSSCardReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->proxyProvideRetailerSSCardReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerSSCardReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
    .locals 1

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule;->provideRetailerSSCardReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->get()Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object v0

    return-object v0
.end method
