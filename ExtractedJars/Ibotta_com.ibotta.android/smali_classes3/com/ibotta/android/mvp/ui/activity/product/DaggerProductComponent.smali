.class public final Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;
.super Ljava/lang/Object;
.source "DaggerProductComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/product/ProductComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/product/ProductView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;
    .locals 2

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)V
    .locals 9

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 89
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/product/ProductModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 88
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/product/ProductModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 109
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 108
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectProductActivity(Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;)Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 147
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 146
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 144
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 152
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 151
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 149
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 157
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 156
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 154
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 162
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 161
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 159
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 167
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 166
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 164
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 172
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 171
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 169
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 177
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 176
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 174
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 182
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 181
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 179
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 187
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 186
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 184
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 192
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 191
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 206
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 204
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 212
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 211
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 209
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 217
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 216
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/product/ProductView;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;)V
    .locals 0

    .line 139
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/product/DaggerProductComponent;->injectProductActivity(Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;)Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/product/ProductView;)V
    .locals 0

    return-void
.end method
