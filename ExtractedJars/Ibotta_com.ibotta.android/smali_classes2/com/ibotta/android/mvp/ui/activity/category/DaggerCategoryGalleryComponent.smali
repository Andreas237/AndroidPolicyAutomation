.class public final Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;
.super Ljava/lang/Object;
.source "DaggerCategoryGalleryComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;
    }
.end annotation


# instance fields
.field private categoryGalleryReducerProvider:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getBannerReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;

.field private getCategoryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;

.field private getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

.field private getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

.field private getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

.field private getLoadRetailerCategoriesVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

.field private getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideCategoryGalleryEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$1;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;
    .locals 2

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)V
    .locals 12

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 120
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 129
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 130
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 131
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getLoadRetailerCategoriesVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;

    .line 134
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 135
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 136
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getCategoryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;

    .line 142
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getCategoryEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryEventContextProvider;

    .line 141
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;

    move-result-object v0

    .line 140
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideCategoryGalleryEventContextProvider:Ljavax/inject/Provider;

    .line 143
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 144
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 148
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideCategoryGalleryEventContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 147
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvidesAccountTrackingFactory;->create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvidesAccountTrackingFactory;

    move-result-object v0

    .line 146
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    .line 152
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;

    .line 153
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getBannerReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;

    .line 154
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    .line 155
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    .line 156
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 157
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 158
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 160
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 161
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 162
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 163
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 164
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 165
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getBannerReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getBannerReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 166
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->categoryGalleryReducerProvider:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;

    .line 173
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 174
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 175
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 176
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 180
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getLoadRetailerCategoriesVariantProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getLoadRetailerCategoriesVariant;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->providesAccountTrackingProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->categoryGalleryReducerProvider:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 179
    invoke-static/range {v2 .. v11}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 178
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 190
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 191
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 192
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 193
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 194
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 195
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 196
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 197
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 198
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 199
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 203
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 202
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 201
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 209
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    move-result-object p1

    .line 212
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideScrollingBottomSpaceFactory;->create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideScrollingBottomSpaceFactory;

    move-result-object p1

    .line 211
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectCategoryGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 244
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 243
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 241
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 249
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 248
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 246
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 254
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 253
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 251
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 259
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 258
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 256
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 264
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 263
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 261
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 269
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 268
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 266
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 274
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 273
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 271
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 279
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 278
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 276
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 284
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 283
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 281
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 289
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 288
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 286
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 294
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 293
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 291
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 299
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 298
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 296
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 304
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 303
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 301
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 306
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 309
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 308
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 306
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 314
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 313
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 311
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;Landroid/os/Handler;)V

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 319
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 318
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 316
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideScrollingBottomSpaceProvider:Ljavax/inject/Provider;

    .line 322
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    .line 321
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity_MembersInjector;->injectScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)V
    .locals 0

    .line 236
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/DaggerCategoryGalleryComponent;->injectCategoryGalleryActivity(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;)V
    .locals 0

    return-void
.end method
