.class public final Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideRetailerHorizListReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerSSCardReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
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
            "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->retailerSSCardReducerProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->proxyProvideRetailerHorizListReducer(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerHorizListReducer(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 0

    .line 51
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideRetailerHorizListReducer(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 50
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->retailerSSCardReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->get()Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v0

    return-object v0
.end method
