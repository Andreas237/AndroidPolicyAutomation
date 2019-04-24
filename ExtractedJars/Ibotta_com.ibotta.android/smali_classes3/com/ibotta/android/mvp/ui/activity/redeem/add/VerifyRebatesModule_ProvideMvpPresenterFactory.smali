.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "VerifyRebatesModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;",
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

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final offerCategoryHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferCategoryHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final scanRulesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final verificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferCategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->offerCategoryHelperProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferCategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 107
    new-instance v10, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;

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

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v10
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferCategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;"
        }
    .end annotation

    .line 87
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 88
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 89
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/helper/offer/OfferCategoryHelper;

    .line 90
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/verification/VerificationManager;

    .line 91
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/rules/ScanRules;

    .line 92
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/util/Formatting;

    .line 93
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 94
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/title/TitleBarReducer;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object p7, v6

    move-object/from16 p8, v7

    .line 85
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
    .locals 0

    .line 130
    invoke-virtual/range {p0 .. p8}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 129
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
    .locals 9

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->offerCategoryHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    move-result-object v0

    return-object v0
.end method
