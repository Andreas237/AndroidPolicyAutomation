.class public final Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;
.super Ljava/lang/Object;
.source "DaggerLoyaltyCardInstructionsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;",
            ">;"
        }
    .end annotation
.end field

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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;
    .locals 2

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)V
    .locals 8

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 68
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 80
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 79
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 98
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 97
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectLoyaltyCardInstructionsActivity(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 137
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 136
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 134
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 142
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 141
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 139
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 147
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 146
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 144
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 152
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 151
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 149
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 157
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 156
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 154
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 162
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 161
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 159
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 167
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 166
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 164
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 172
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 171
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 169
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 177
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 176
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 174
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 182
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 181
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 179
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 187
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 186
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 184
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 192
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 191
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;)V
    .locals 0

    .line 128
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->injectLoyaltyCardInstructionsActivity(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;)V
    .locals 0

    return-void
.end method
