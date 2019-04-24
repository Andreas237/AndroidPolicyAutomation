.class public final Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "ProductModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 88
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;"
        }
    .end annotation

    .line 72
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 73
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/util/AppHelper;

    .line 74
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 75
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 76
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 77
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object v0, p0

    .line 70
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;
    .locals 0

    .line 107
    invoke-virtual/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 106
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;
    .locals 7

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    move-result-object v0

    return-object v0
.end method
