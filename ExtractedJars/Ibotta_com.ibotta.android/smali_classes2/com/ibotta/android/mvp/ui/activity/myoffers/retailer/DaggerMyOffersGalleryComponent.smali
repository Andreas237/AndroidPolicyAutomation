.class public final Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;
.super Ljava/lang/Object;
.source "DaggerMyOffersGalleryComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGalleryHeaderReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;

.field private getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private myOffersGalleryReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;

.field private provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;",
            ">;"
        }
    .end annotation
.end field

.field private provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$1;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
    .locals 2

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)V
    .locals 17

    move-object/from16 v0, p0

    .line 117
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    .line 116
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 118
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 119
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 120
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 121
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 122
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 123
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 124
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;

    .line 125
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGalleryHeaderReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;

    .line 126
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    .line 127
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    .line 128
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 129
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 130
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGalleryHeaderReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryHeaderReducer;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 131
    invoke-static {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->myOffersGalleryReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;

    .line 135
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 136
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 137
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 138
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 139
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 140
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 141
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 142
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 143
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 144
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 145
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 146
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 147
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 148
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 149
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 150
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 154
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v1

    .line 153
    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;

    move-result-object v1

    .line 152
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    .line 155
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 156
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 157
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 158
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 159
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 160
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 161
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 162
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 163
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 164
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 168
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 167
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 166
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 174
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 175
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 179
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 178
    invoke-static/range {v3 .. v9}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;

    move-result-object v1

    .line 177
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    .line 186
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 187
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 191
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->myOffersGalleryReducerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    move-object/from16 v16, v1

    .line 190
    invoke-static/range {v3 .. v16}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 189
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 205
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectMyOffersGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 241
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 240
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 246
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 245
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 243
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 251
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 250
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 248
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 256
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 255
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 253
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 261
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 260
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 258
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 266
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 265
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 263
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 271
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 270
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 268
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 276
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 275
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 273
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 281
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 280
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 278
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 286
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 285
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 283
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 291
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 290
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 288
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 296
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 295
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 293
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 301
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 300
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 298
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 306
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGalleryHeaderReducer()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 305
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 303
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity_MembersInjector;->injectGalleryHeaderReducer(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)V
    .locals 0

    .line 228
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;->injectMyOffersGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;)V
    .locals 0

    return-void
.end method
