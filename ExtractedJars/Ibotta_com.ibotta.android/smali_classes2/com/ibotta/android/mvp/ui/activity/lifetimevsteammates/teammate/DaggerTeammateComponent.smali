.class public final Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;
.super Ljava/lang/Object;
.source "DaggerTeammateComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImageCacheProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;
    .locals 2

    .line 63
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)V
    .locals 9

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 69
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 72
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getImageCacheProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getImageCacheProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getImageCache;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 85
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 84
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 103
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectTeammateActivity(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 141
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 140
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 138
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 146
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 145
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 143
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 151
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 150
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 148
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 155
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 153
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 161
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 160
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 166
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 165
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 163
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/state/user/UserState;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 231
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 230
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 228
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectApiWorkSubmitter(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 241
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 240
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity_MembersInjector;->injectApiJobFactory(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;)V
    .locals 0

    .line 133
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->injectTeammateActivity(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;)V
    .locals 0

    return-void
.end method
