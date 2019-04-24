.class public final Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;
.super Ljava/lang/Object;
.source "DaggerEarningsDetailComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;
    .locals 2

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)V
    .locals 8

    .line 67
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 66
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 80
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 79
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 97
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectEarningsDetailActivity(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 135
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 134
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 132
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 140
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 139
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 137
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 145
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 144
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 142
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 150
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 149
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 147
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 154
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;)V
    .locals 0

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->injectEarningsDetailActivity(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;)V
    .locals 0

    return-void
.end method
