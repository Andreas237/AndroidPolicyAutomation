.class public final Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;
.super Ljava/lang/Object;
.source "DaggerGalleryComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

.field private getAsyncRecentSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;

.field private getAsyncUnifiedSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;

.field private getContentHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;

.field private getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

.field private getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGalleryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;

.field private getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMisspellingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

.field private getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getSearchAsyncProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;

.field private getSearchReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;

.field private getSuggestedSearchItemsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideGalleryDetailEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideGalleryPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryPresenterHelperFactory;

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
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferAnomalyDetectorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;",
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

.field private searchResultsReducerProvider:Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$1;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;
    .locals 2

    .line 171
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)V
    .locals 31

    move-object/from16 v0, p0

    .line 177
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 178
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 179
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 180
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 181
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 182
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 183
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 184
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 185
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 186
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;

    .line 187
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSearchAsyncProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;

    .line 188
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 189
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 190
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 191
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 192
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 193
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 194
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 196
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 199
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideOfferAnomalyDetectorFactory;->create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideOfferAnomalyDetectorFactory;

    move-result-object v1

    .line 198
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideOfferAnomalyDetectorProvider:Ljavax/inject/Provider;

    .line 200
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;

    .line 201
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAsyncRecentSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;

    .line 202
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;

    .line 203
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAsyncUnifiedSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;

    .line 204
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 205
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 206
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 207
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 208
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;

    .line 210
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGalleryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;

    .line 214
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v1

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGalleryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryEventContextProvider;

    .line 213
    invoke-static {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryDetailEventContextProviderFactory;->create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryDetailEventContextProviderFactory;

    move-result-object v1

    .line 212
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideGalleryDetailEventContextProvider:Ljavax/inject/Provider;

    .line 215
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 216
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 217
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 218
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 222
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v1

    .line 221
    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;

    move-result-object v1

    .line 220
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    .line 223
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 224
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 225
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 226
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 227
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 228
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 229
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 230
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 234
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 233
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 232
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 240
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 241
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 245
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 244
    invoke-static/range {v3 .. v9}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;

    move-result-object v1

    .line 243
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    .line 255
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v1

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideGalleryDetailEventContextProvider:Ljavax/inject/Provider;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 254
    invoke-static {v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;

    move-result-object v1

    .line 253
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    .line 259
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 260
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 261
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 262
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 263
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 264
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 265
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;

    .line 266
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMisspellingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;

    .line 267
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 269
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 270
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 271
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 272
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMisspellingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMisspellingReducer;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 273
    invoke-static {v1, v2, v3, v4, v5}, Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->searchResultsReducerProvider:Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;

    .line 279
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 280
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 281
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;

    .line 282
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;

    .line 283
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;

    .line 284
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSearchReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;

    .line 285
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;

    .line 287
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSuggestedSearchItemsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;

    .line 288
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    .line 289
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    .line 290
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGalleryOrganizerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGalleryOrganizer;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 291
    invoke-static {v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryPresenterHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryPresenterHelperFactory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideGalleryPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryPresenterHelperFactory;

    .line 296
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 298
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 299
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    .line 301
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    .line 305
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSearchAsyncProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchAsync;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideOfferAnomalyDetectorProvider:Ljavax/inject/Provider;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAsyncRecentSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncRecentSearchService;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getAsyncUnifiedSearchServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getAsyncUnifiedSearchService;

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideGalleryDetailEventContextProvider:Ljavax/inject/Provider;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->searchResultsReducerProvider:Lcom/ibotta/android/reducers/search/SearchResultsReducer_Factory;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getContentHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getContentHelper;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSearchReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSearchReducer;

    move-object/from16 v26, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getSuggestedSearchItemsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getSuggestedSearchItemsReducer;

    move-object/from16 v27, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideGalleryPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideGalleryPresenterHelperFactory;

    move-object/from16 v28, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    move-object/from16 v29, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    move-object/from16 v30, v1

    .line 304
    invoke-static/range {v3 .. v30}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 303
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 333
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 336
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideScrollingBottomSpaceFactory;->create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvideScrollingBottomSpaceFactory;

    move-result-object v1

    .line 335
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 367
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 366
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 364
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 369
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 372
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 371
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 369
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 377
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 376
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 374
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 382
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 381
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 379
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 384
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 387
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 386
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 384
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 392
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 391
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 389
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 397
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 396
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 394
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 402
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 401
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 399
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 407
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 406
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 404
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 409
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 412
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 411
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 409
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 414
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 417
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 416
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 414
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 419
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 422
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 421
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 419
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 424
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 427
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 426
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 424
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 429
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 432
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 431
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 429
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 434
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 437
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 436
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 434
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 439
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 442
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 441
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 439
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/search/SearchMvpActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/base/search/SearchMvpActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 444
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 447
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImTextHelper()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 446
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 444
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectImUtil(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V

    .line 449
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 452
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 451
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 449
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 457
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 456
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 454
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 459
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 462
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 461
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 459
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Landroid/os/Handler;)V

    .line 464
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 467
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 466
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 464
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 469
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 472
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 471
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 469
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 474
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    .line 475
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    .line 474
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    .line 476
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 479
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGalleryHeaderReducer()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 478
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 476
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectGalleryHeaderReducer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;)V

    .line 481
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 484
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRouteHandler()Lcom/ibotta/android/routing/RouteHandler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 483
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/RouteHandler;

    .line 481
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectRouteHandler(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RouteHandler;)V

    .line 486
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 489
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRoutePreviewer()Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 488
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/RoutePreviewer;

    .line 486
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectRoutePreviewer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V

    .line 491
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 494
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTrackingUtil()Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 493
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    .line 491
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity_MembersInjector;->injectBrazeTrackingDataFactory(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 58
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
    .locals 0

    .line 359
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/DaggerGalleryComponent;->injectGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;)V
    .locals 0

    return-void
.end method
