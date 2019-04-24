.class public final Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideRetailerSummaryReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
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
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/retailer/RetailerSummaryReducer;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->proxyProvideRetailerSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;
    .locals 1

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule;->provideRetailerSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/retailer/RetailerSummaryReducer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->get()Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object v0

    return-object v0
.end method
