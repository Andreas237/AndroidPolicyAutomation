.class public final Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;
.super Ljava/lang/Object;
.source "DaggerMyOffersComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getMyRebatesEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
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

.field private provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
            ">;"
        }
    .end annotation
.end field

.field private providesAccountTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$1;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;
    .locals 2

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)V
    .locals 13

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 109
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 111
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 112
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMyRebatesEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMyRebatesEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 124
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvidesAccountTrackingFactory;->create(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvidesAccountTrackingFactory;

    move-result-object v0

    .line 123
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    .line 129
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 130
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 134
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 133
    invoke-static/range {v2 .. v12}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 132
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 145
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 146
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 147
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 148
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 149
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 150
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 151
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 152
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 156
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 155
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 154
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 162
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->create(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;

    move-result-object p1

    .line 164
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectMyOffersActivity(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 231
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 230
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 228
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 241
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 240
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 246
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 245
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 243
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 251
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 250
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 248
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 256
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 255
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 253
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 261
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 260
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 258
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 266
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 265
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 263
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    .line 269
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    .line 268
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V
    .locals 0

    .line 188
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;->injectMyOffersActivity(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;)V
    .locals 0

    return-void
.end method
