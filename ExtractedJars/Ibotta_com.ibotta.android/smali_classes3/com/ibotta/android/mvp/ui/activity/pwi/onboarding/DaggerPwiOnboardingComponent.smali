.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;
.super Ljava/lang/Object;
.source "DaggerPwiOnboardingComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiOnboardingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;

.field private provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;
    .locals 2

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)V
    .locals 8

    .line 66
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 65
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 67
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 68
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 72
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->providePwiOnboardingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->providePwiOnboardingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 78
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 77
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 95
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 94
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectPwiOnboardingActivity(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 133
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 132
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 130
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 138
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 137
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 135
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 143
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 142
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 140
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 148
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 147
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 145
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 153
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 152
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 150
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 158
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 157
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 155
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 162
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 168
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 167
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 165
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 173
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 172
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 177
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 175
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 193
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 192
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 190
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->injectPwiOnboardingActivity(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;)V
    .locals 0

    return-void
.end method
