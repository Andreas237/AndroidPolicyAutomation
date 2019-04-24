.class public final Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "RegistrationModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceSecurityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final partnerAppCheckerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;"
        }
    .end annotation
.end field

.field private final postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field

.field private final validationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Validation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Validation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->validationProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->partnerAppCheckerProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 63
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Validation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 116
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v11
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Validation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;"
        }
    .end annotation

    .line 94
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 95
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 96
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/security/DeviceSecurity;

    .line 97
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/util/Formatting;

    .line 98
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/util/Validation;

    .line 99
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/state/user/UserState;

    .line 100
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    .line 101
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 102
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    .line 92
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;
    .locals 0

    .line 141
    invoke-virtual/range {p0 .. p9}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 140
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;
    .locals 10

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->validationProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->partnerAppCheckerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->postAuthWorkJobFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    move-result-object v0

    return-object v0
.end method
