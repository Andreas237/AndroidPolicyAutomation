.class public final Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;
.super Ljava/lang/Object;
.source "DaggerLoyaltyCardAddComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;
    .locals 2

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)V
    .locals 11

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 77
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getValidation;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 97
    invoke-static/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 109
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 111
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 112
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 117
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 116
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectLoyaltyCardAddActivity(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 154
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V
    .locals 0

    .line 147
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->injectLoyaltyCardAddActivity(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;)V
    .locals 0

    return-void
.end method
