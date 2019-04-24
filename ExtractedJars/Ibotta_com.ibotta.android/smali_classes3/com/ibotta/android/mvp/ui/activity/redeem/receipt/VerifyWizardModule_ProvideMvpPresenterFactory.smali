.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "VerifyWizardModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 71
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;"
        }
    .end annotation

    .line 59
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 60
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 61
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/verification/VerificationManager;

    .line 62
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/api/rules/ScanRules;

    .line 57
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;
    .locals 0

    .line 86
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 85
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;
    .locals 5

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->scanRulesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    move-result-object v0

    return-object v0
.end method
