.class public final Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "ModuleModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentListReducerUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
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

.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

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

.field private final retailerHorizListReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    .line 50
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 106
    new-instance v10, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v10
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;"
        }
    .end annotation

    .line 86
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 87
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 88
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 89
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 90
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/mappers/ContentMapper;

    .line 91
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 92
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 93
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object p7, v6

    move-object/from16 p8, v7

    .line 84
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
    .locals 0

    .line 129
    invoke-virtual/range {p0 .. p8}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 128
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
    .locals 9

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    move-result-object v0

    return-object v0
.end method
