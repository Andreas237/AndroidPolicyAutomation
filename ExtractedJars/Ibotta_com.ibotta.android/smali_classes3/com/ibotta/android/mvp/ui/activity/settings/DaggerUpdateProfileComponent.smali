.class public final Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;
.super Ljava/lang/Object;
.source "DaggerUpdateProfileComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPasswordCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
            ">;"
        }
    .end annotation
.end field

.field private providePasswordPrompterFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;
    .locals 2

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)V
    .locals 9

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 80
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getValidation;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 96
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 114
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 113
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getPasswordCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 129
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getPasswordCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getPasswordCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 128
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;

    move-result-object p1

    .line 127
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->providePasswordPrompterFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectUpdateProfileActivity(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getPasswordCache()Lcom/ibotta/android/security/PasswordCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/PasswordCache;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_MembersInjector;->injectPasswordCache(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Lcom/ibotta/android/security/PasswordCache;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->providePasswordPrompterFactoryProvider:Ljavax/inject/Provider;

    .line 233
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_MembersInjector;->injectPasswordPrompterFactory(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->injectUpdateProfileActivity(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;)V
    .locals 0

    return-void
.end method
