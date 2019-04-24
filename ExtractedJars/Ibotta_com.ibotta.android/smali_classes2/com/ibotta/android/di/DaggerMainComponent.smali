.class public final Lcom/ibotta/android/di/DaggerMainComponent;
.super Ljava/lang/Object;
.source "DaggerMainComponent.java"

# interfaces
.implements Lcom/ibotta/android/di/MainComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/di/DaggerMainComponent$Builder;
    }
.end annotation


# instance fields
.field private application:Lcom/ibotta/android/App;

.field private applicationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private getAppsFlyerUIDProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private namedMapOfStringAndTestConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideActivityLifecycleListenerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ActivityLifecycleListener;",
            ">;"
        }
    .end annotation
.end field

.field private provideAggregateCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private provideAllGalleryTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryTestConfigFactory;

.field private provideAlsoBoughtViewedVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantSelectorFactory;

.field private provideApiCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/ApiContext;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiExecutionFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/execution/ApiExecutionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiJobEnvironmentProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobEnvironment;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiJobFactoryProvider:Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;

.field private provideApiLayerNewRelicInterceptorProvider:Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;

.field private provideApiOkHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiWorkExecutorServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiWorkServiceExecutorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiWorkServiceLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiWorkSubmitterProvider:Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

.field private provideApiWorkWaitConditionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;"
        }
    .end annotation
.end field

.field private provideApolloClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/ApolloClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppCacheCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/AppCacheCallback;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppCacheDirInternalProvider:Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;

.field private provideAppCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppCacheStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppConfigCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

.field private provideAppOkHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppPickerVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAppPickerVariantSelectorFactory;

.field private provideAppSemverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppSemver;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppTimingTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppUpgraderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppVersionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

.field private provideAppsFlyerStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;"
        }
    .end annotation
.end field

.field private provideAsyncGroupManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideAtomicBoundedIntegerProvider:Lcom/ibotta/android/di/TrackingModule_ProvideAtomicBoundedIntegerFactory;

.field private provideAuthManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideAvailableAtRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;

.field private provideBackgroundHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private provideBannerReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/BannerReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideBitmapUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideBlacklistClassifierFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideBlacklistEngineProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;",
            ">;"
        }
    .end annotation
.end field

.field private provideBonusBucketedComparatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/collection/BonusBucketedComparator;",
            ">;"
        }
    .end annotation
.end field

.field private provideBonusHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideBonusMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

.field private provideBonusQualificationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;

.field private provideBrazeTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;"
        }
    .end annotation
.end field

.field private provideBrazeTrackingUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/braze/BrazeTrackingDataFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideBreadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideBreadcrumbSharedPreferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideBreadcrumbStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ">;"
        }
    .end annotation
.end field

.field private provideBuildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private provideButtonInfoMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;

.field private provideButtonSdkCacheRemoverProvider:Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;

.field private provideButtonSdkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideButtonSdkStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;"
        }
    .end annotation
.end field

.field private provideBuyableGiftCardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;

.field private provideBuyableGiftCardRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;

.field private provideCacheClearHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideCacheClearJobFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;

.field private provideCacheClearRunnableFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideCacheFetchStrategyFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheFetchStrategyFactoryFactory;

.field private provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideCacheKeyResolverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;",
            ">;"
        }
    .end annotation
.end field

.field private provideCachePoliciesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/policy/CachePolicies;",
            ">;"
        }
    .end annotation
.end field

.field private provideCacheTimesSharedPreferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideCategoryHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideChuckInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/readystatesoftware/chuck/ChuckInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideClearCookiesLogOutListenerProvider:Lcom/ibotta/android/di/AppApiModule_ProvideClearCookiesLogOutListenerFactory;

.field private provideClearableCookieJarProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;",
            ">;"
        }
    .end annotation
.end field

.field private provideConfigParserHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/ConfigParserHolder;",
            ">;"
        }
    .end annotation
.end field

.field private provideConsumerFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ConsumerFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideContentBackgroundReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentBackgroundReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideContentHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/content/ContentHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideContentMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private provideCriticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideCustomerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideCustomerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideCustomerSocialHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/social/CustomerSocialHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideDealImageReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/deal/DealImageReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideDealMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;

.field private provideDealSummaryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/deal/DealSummaryReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideDebugFeatureFlagReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideDebugFeatureFlagStoragePrefsProvider:Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStoragePrefsFactory;

.field private provideDebugFeatureFlagStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;"
        }
    .end annotation
.end field

.field private provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

.field private provideDebugStateSharedPrefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideDefaultApiInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideDefaultApiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/tracking/generated/api/DefaultApi;",
            ">;"
        }
    .end annotation
.end field

.field private provideDefaultNotificationChannelIdProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;

.field private provideDefaultNotificationComposerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;

.field private provideDefaultOkHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideDeviceRegistrationAsyncProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/DeviceRegistrationAsync;",
            ">;"
        }
    .end annotation
.end field

.field private provideDeviceRegistrationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/DeviceRegistration;",
            ">;"
        }
    .end annotation
.end field

.field private provideDeviceSecurityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;"
        }
    .end annotation
.end field

.field private provideDigitalProductHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/DigitalProductHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideEarningsHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/earnings/EarningsHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideEmailStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/email/EmailState;",
            ">;"
        }
    .end annotation
.end field

.field private provideEngagementMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;

.field private provideEventBodyFactoryProvider:Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

.field private provideEventIdCounterAtomicIntegerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;"
        }
    .end annotation
.end field

.field private provideExecServiceManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideExpirationDateFormatSupplierProvider:Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;

.field private provideFavoriteRetailerManagerFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideFavoriteRetailerNotifierProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;",
            ">;"
        }
    .end annotation
.end field

.field private provideFavoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;"
        }
    .end annotation
.end field

.field private provideFcmStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;"
        }
    .end annotation
.end field

.field private provideFcmTokenManagerProvider:Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

.field private provideFeatureFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideFeatureMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

.field private provideFeaturedBannerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideFeaturedNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideFeaturedRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;

.field private provideFileIOProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/FileIO;",
            ">;"
        }
    .end annotation
.end field

.field private provideFileProviderHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/share/FileProviderHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideFlagsApiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsApi;",
            ">;"
        }
    .end annotation
.end field

.field private provideFlagsCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private provideFlagsUserFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideFlippedFlowConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowConfigFactory;

.field private provideFormattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private provideFrontDoorActivitiesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private provideGameQuestionDriverFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideGeofenceConfigHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private provideGiftCardHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/card/GiftCardHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideGlobalEventManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideGoogleAIDRetrieverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/GoogleAIDRetriever;",
            ">;"
        }
    .end annotation
.end field

.field private provideGoogleStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;"
        }
    .end annotation
.end field

.field private provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

.field private provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

.field private provideHttpCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideHttpCacheStoreProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;",
            ">;"
        }
    .end annotation
.end field

.field private provideHttpHeadersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/HttpHeaders;",
            ">;"
        }
    .end annotation
.end field

.field private provideIbottaApolloLoggerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
            ">;"
        }
    .end annotation
.end field

.field private provideIbottaHeaderInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideIbottaLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideImUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideImageCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideLaunchDarklyInitializerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsInitializer;",
            ">;"
        }
    .end annotation
.end field

.field private provideLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoadNotificationsVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadNotificationsVariantSelectorFactory;

.field private provideLoadRetailerCategoriesTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesTestConfigFactory;

.field private provideLoadRetailersVariantProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;

.field private provideLoadRetailersVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantSelectorFactory;

.field private provideLocaleProvider:Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;

.field private provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private provideLocationUpdateManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideLogOutListenersProvider:Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;

.field private provideLogOutManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/LogOutManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideLooperProvider:Lcom/ibotta/android/di/AppModule_ProvideLooperFactory;

.field private provideLoyaltyLinkTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkTestConfigFactory;

.field private provideMappersProvider:Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;

.field private provideMcommPercentCashBackTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideMcommPercentCashBackTestConfigFactory;

.field private provideMisspellingReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/MisspellingReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideModuleMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;

.field private provideModulesSaltInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvtCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvtTestsHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;"
        }
    .end annotation
.end field

.field private provideNewRelicLifecycleTrackerProvider:Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicLifecycleTrackerFactory;

.field private provideNewRelicSessionAttributesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;",
            ">;"
        }
    .end annotation
.end field

.field private provideNormalizedCacheFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

.field private provideNotificationDetailFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideNotificationManagerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;

.field private provideNotificationRoutingUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferCategoryHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferCategoryHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;

.field private provideOfferCategoryWithReferencesMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;

.field private provideOfferEvictionPolicyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

.field private provideOfferQuantityDatabaseProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/OfferQuantityDatabase;",
            ">;"
        }
    .end annotation
.end field

.field private provideOfferRewardQuestionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;

.field private provideOptionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OptionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideOptionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

.field private providePartnerAppCheckerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            ">;"
        }
    .end annotation
.end field

.field private providePartnerAppDetectorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
            ">;"
        }
    .end annotation
.end field

.field private providePartnerAppEventFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
            ">;"
        }
    .end annotation
.end field

.field private providePartnerAppTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
            ">;"
        }
    .end annotation
.end field

.field private providePasswordCacheExecutorFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCacheExecutorFactory;",
            ">;"
        }
    .end annotation
.end field

.field private providePasswordCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;"
        }
    .end annotation
.end field

.field private providePermissionPrimersTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersTestConfigFactory;

.field private providePermissionStrategyManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            ">;"
        }
    .end annotation
.end field

.field private providePermissionStrategyMultitonProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionStrategyMultiton;",
            ">;"
        }
    .end annotation
.end field

.field private providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;"
        }
    .end annotation
.end field

.field private providePermissionsStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;"
        }
    .end annotation
.end field

.field private providePipelineFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;"
        }
    .end annotation
.end field

.field private providePixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideProdConConsumeConditionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;"
        }
    .end annotation
.end field

.field private provideProdConProduceConditionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;"
        }
    .end annotation
.end field

.field private provideProducerFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ProducerFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideProductGroupHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/ProductGroupHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideProductGroupMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;

.field private provideProductHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideProductMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;

.field private provideProductsInSearchTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideProductsInSearchTestConfigFactory;

.field private provideProfileDebugStateCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
            ">;"
        }
    .end annotation
.end field

.field private providePushMessagingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiPlayhouseConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayhouseConfigFactory;

.field private providePwiRetailersHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiTestConfigFactory;

.field private providePwiUserStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;"
        }
    .end annotation
.end field

.field private provideQuestMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;

.field private provideRadarGeofenceConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
            ">;"
        }
    .end annotation
.end field

.field private provideRadarGeofenceStatusListenerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private provideRadarGeofenceStatusManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideReceiptProcessingMathProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
            ">;"
        }
    .end annotation
.end field

.field private provideReceiptSubmissionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideRecentSearchDatabaseProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/recent/RecentSearchDatabase;",
            ">;"
        }
    .end annotation
.end field

.field private provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

.field private provideRetailerBarcodeConfigurationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;

.field private provideRetailerBarcodeScanTypeMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;

.field private provideRetailerCategoriesReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetailerCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;

.field private provideRetailerCategoryNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetailerIconOnOfferVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantSelectorFactory;

.field private provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

.field private provideRetailerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetailerRedemptionMetaMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;

.field private provideRewardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;

.field private provideRoomKeyValuePersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;

.field private provideRoomTrackingFlushSchedulerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            ">;"
        }
    .end annotation
.end field

.field private provideRootVariantSelectorFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideRouteCleanerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;"
        }
    .end annotation
.end field

.field private provideRouteHandlerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;

.field private provideRoutePreviewerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;

.field private provideRuleEvaluatorFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideScanRulesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;"
        }
    .end annotation
.end field

.field private provideScheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideScheduledWorkReceiverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideScheduledWorkersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideScreenNameMapProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;",
            ">;"
        }
    .end annotation
.end field

.field private provideSearchReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SearchReducer;",
            ">;"
        }
    .end annotation
.end field

.field private provideSecureStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/secure/SecureState;",
            ">;"
        }
    .end annotation
.end field

.field private provideSemverFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/SemverFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideServerUpgradeStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;",
            ">;"
        }
    .end annotation
.end field

.field private provideSessionStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;"
        }
    .end annotation
.end field

.field private provideSharedPrefsLastKeyPersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;

.field private provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

.field private provideStatusBarNotificationHelperProvider:Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;

.field private provideStopWatchProvider:Lcom/ibotta/android/di/AopModule_ProvideStopWatchFactory;

.field private provideStopWatchesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
            ">;"
        }
    .end annotation
.end field

.field private provideStorageSiloStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/xprocess/StorageSiloState;",
            ">;"
        }
    .end annotation
.end field

.field private provideTMonitorClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideTaskHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideTeamworkEnabledTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTeamworkEnabledTestConfigFactory;

.field private provideTelephonyManagerProvider:Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;

.field private provideTestConfigFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/TestConfigFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideTestConfigRegistryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private provideTitleBarReducerProvider:Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;

.field private provideToolbarAmountBadgeTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountBadgeTestConfigFactory;

.field private provideTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field

.field private provideTrackingApiClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideTrackingEventDaoProvider:Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;

.field private provideTrackingEventDatabaseProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;",
            ">;"
        }
    .end annotation
.end field

.field private provideTrackingFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;"
        }
    .end annotation
.end field

.field private provideTrackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;"
        }
    .end annotation
.end field

.field private provideTypeAheadHighlightingConnfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadHighlightingConnfigFactory;

.field private provideTypeAheadRecentSearchIconShownVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadRecentSearchIconShownVariantSelectorFactory;

.field private provideUpgradeCheckerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/upgrade/UpgradeChecker;",
            ">;"
        }
    .end annotation
.end field

.field private provideUpgradeStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/UpgradeState;",
            ">;"
        }
    .end annotation
.end field

.field private provideUserStateAppCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/UserStateAppCallback;",
            ">;"
        }
    .end annotation
.end field

.field private provideUserStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field

.field private provideV1TrackingClientProvider:Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;

.field private provideValidationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Validation;",
            ">;"
        }
    .end annotation
.end field

.field private provideVariantChainFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/selector/VariantChainFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideVariantSelectorFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantSelectorFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideVerificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideWindfallGatekeeperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;",
            ">;"
        }
    .end annotation
.end field

.field private provideWindfallHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/helper/WindfallHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideWindfallReceiptSdkProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/WindfallReceiptSdk;",
            ">;"
        }
    .end annotation
.end field

.field private provideWindfallRetailerSupportProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V
    .locals 0

    .line 1170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1171
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->initialize(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V

    .line 1172
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->initialize2(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V

    .line 1173
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->initialize3(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/di/DaggerMainComponent$Builder;Lcom/ibotta/android/di/DaggerMainComponent$1;)V
    .locals 0

    .line 565
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;-><init>(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/di/MainComponent$Builder;
    .locals 2

    .line 1177
    new-instance v0, Lcom/ibotta/android/di/DaggerMainComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/di/DaggerMainComponent$Builder;-><init>(Lcom/ibotta/android/di/DaggerMainComponent$1;)V

    return-object v0
.end method

.method private getAllGalleryCategoryVariant()Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;
    .locals 1

    .line 1241
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 1242
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryCategoryVariantFactory;->proxyProvideAllGalleryCategoryVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    move-result-object v0

    return-object v0
.end method

.method private getAvailableAtRetailerMapper()Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;
    .locals 1

    .line 1307
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1308
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;->proxyProvideAvailableAtRetailerMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

    move-result-object v0

    return-object v0
.end method

.method private getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 4

    .line 1331
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1332
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1333
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getQuestMapper()Lcom/ibotta/android/graphql/mapper/QuestMapper;

    move-result-object v1

    .line 1334
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBonusQualificationMapper()Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object v2

    .line 1335
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getSortResultMapper()Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    move-result-object v3

    .line 1331
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->proxyProvideBonusMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object v0

    return-object v0
.end method

.method private getBonusQualificationMapper()Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
    .locals 1

    .line 1326
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1327
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1326
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->proxyProvideBonusQualificationMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object v0

    return-object v0
.end method

.method private getButtonInfoMapper()Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;
    .locals 1

    .line 1246
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1247
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1246
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;->proxyProvideButtonInfoMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    move-result-object v0

    return-object v0
.end method

.method private getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;
    .locals 2

    .line 1376
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1377
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v1

    .line 1376
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;->proxyProvideBuyableGiftCardMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object v0

    return-object v0
.end method

.method private getBuyableGiftCardRetailerMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;
    .locals 1

    .line 1381
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1382
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;->proxyProvideBuyableGiftCardRetailerMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    move-result-object v0

    return-object v0
.end method

.method private getDealMapper()Lcom/ibotta/android/graphql/mapper/DealMapper;
    .locals 2

    .line 1386
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1387
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getSortResultMapper()Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    move-result-object v1

    .line 1386
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;->proxyProvideDealMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/DealMapper;

    move-result-object v0

    return-object v0
.end method

.method private getEngagementMapper()Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 3

    .line 1391
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1392
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferRewardQuestionMapper()Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    move-result-object v1

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOptionMapper()Lcom/ibotta/android/graphql/mapper/OptionMapper;

    move-result-object v2

    .line 1391
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->proxyProvideEngagementMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object v0

    return-object v0
.end method

.method private getEventBodyFactory()Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
    .locals 9

    .line 1201
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 1202
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/state/user/UserState;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSessionStateProvider:Ljavax/inject/Provider;

    .line 1203
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/ibotta/android/state/session/SessionState;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceSecurityProvider:Ljavax/inject/Provider;

    .line 1204
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/ibotta/android/security/DeviceSecurity;

    .line 1205
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v4

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 1206
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ibotta/android/profile/BuildProfile;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    .line 1207
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/ibotta/android/state/app/google/GoogleState;

    .line 1208
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTelephonyManager()Landroid/telephony/TelephonyManager;

    move-result-object v7

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventIdCounterAtomicIntegerProvider:Ljavax/inject/Provider;

    .line 1209
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1201
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->proxyProvideEventBodyFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/google/GoogleState;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object v0

    return-object v0
.end method

.method private getFcmTokenManager()Lcom/ibotta/android/async/device/FcmTokenManager;
    .locals 3

    .line 1234
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1235
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 1236
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->proxyProvideFirebaseInstanceId()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBackgroundHandlerProvider:Ljavax/inject/Provider;

    .line 1237
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    .line 1234
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->proxyProvideFcmTokenManager(Landroid/content/Context;Lcom/google/firebase/iid/FirebaseInstanceId;Landroid/os/Handler;)Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object v0

    return-object v0
.end method

.method private getFeatureMapper()Lcom/ibotta/android/graphql/mapper/FeatureMapper;
    .locals 2

    .line 1256
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1257
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getSortResultMapper()Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    move-result-object v1

    .line 1256
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;->proxyProvideFeatureMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    move-result-object v0

    return-object v0
.end method

.method private getFeatureRouteHandler()Lcom/ibotta/android/view/featured/FeatureRouteHandler;
    .locals 2

    .line 1181
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 1182
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 1181
    invoke-static {v0, v1}, Lcom/ibotta/android/di/RoutingModule_ProvideFeatureRouteHandlerFactory;->proxyProvideFeatureRouteHandler(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    move-result-object v0

    return-object v0
.end method

.method private getFeaturedRetailerMapper()Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;
    .locals 2

    .line 1349
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1350
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v1

    .line 1349
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;->proxyProvideFeaturedRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    move-result-object v0

    return-object v0
.end method

.method private getIbottaTrackingClient()Lcom/ibotta/android/tracking/IbottaTrackingClient;
    .locals 3

    .line 1213
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1214
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 1215
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 1216
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getEventBodyFactory()Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object v2

    .line 1213
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingClientFactory;->proxyProvideIbottaTrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/IbottaTrackingClient;

    move-result-object v0

    return-object v0
.end method

.method private getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 9

    .line 1364
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1365
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    .line 1366
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v2

    .line 1367
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v3

    .line 1368
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object v4

    .line 1369
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFeaturedRetailerMapper()Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    move-result-object v5

    .line 1370
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFeatureMapper()Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    move-result-object v6

    .line 1371
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getProductMapper()Lcom/ibotta/android/graphql/mapper/ProductMapper;

    move-result-object v7

    .line 1372
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerCategoryMapper()Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    move-result-object v8

    .line 1364
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->proxyProvideModuleMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object v0

    return-object v0
.end method

.method private getNamedAsyncSuggestedSearchService()Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 1

    .line 1407
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRecentSearchService()Lcom/ibotta/android/search/RecentSearchService;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/di/SearchModule_ProvideDBAsyncSuggestedSearchServiceFactory;->proxyProvideDBAsyncSuggestedSearchService(Lcom/ibotta/android/search/RecentSearchService;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method private getNamedAsyncSuggestedSearchService2()Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 5

    .line 1413
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 1414
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 1415
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v2

    .line 1416
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBackgroundHandlerProvider:Ljavax/inject/Provider;

    .line 1417
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Handler;

    .line 1412
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/SearchModule_ProvideHTTPAsyncSuggestedSearchServiceFactory;->proxyProvideHTTPAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method private getNamedTrackingClient()Lcom/ibotta/android/tracking/TrackingClient;
    .locals 1

    .line 1221
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getIbottaTrackingClient()Lcom/ibotta/android/tracking/IbottaTrackingClient;

    move-result-object v0

    .line 1220
    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideAdviceTrackingClientFactory;->proxyProvideAdviceTrackingClient(Lcom/ibotta/android/tracking/IbottaTrackingClient;)Lcom/ibotta/android/tracking/TrackingClient;

    move-result-object v0

    return-object v0
.end method

.method private getNewRelicTimingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .locals 1

    .line 1191
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStopWatchesProvider:Ljavax/inject/Provider;

    .line 1192
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    invoke-static {v0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->proxyProvideNewRelicTimingAdviceFactory(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object v0

    return-object v0
.end method

.method private getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 2

    .line 1339
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1340
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v1

    .line 1339
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->proxyProvideOfferCategoryMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v0

    return-object v0
.end method

.method private getOfferCategoryWithReferencesMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 1

    .line 1344
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1345
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->proxyProvideOfferCategoryWithReferencesMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object v0

    return-object v0
.end method

.method private getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;
    .locals 5

    .line 1312
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1313
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1314
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRewardMapper()Lcom/ibotta/android/graphql/mapper/RewardMapper;

    move-result-object v1

    .line 1315
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getProductGroupMapper()Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

    move-result-object v2

    .line 1316
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getButtonInfoMapper()Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    move-result-object v3

    .line 1317
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAvailableAtRetailerMapper()Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

    move-result-object v4

    .line 1312
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;->proxyProvideOfferMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RewardMapper;Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;)Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v0

    return-object v0
.end method

.method private getOfferRewardQuestionMapper()Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;
    .locals 2

    .line 1292
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1293
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOptionMapper()Lcom/ibotta/android/graphql/mapper/OptionMapper;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;->proxyProvideOfferRewardQuestionMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    move-result-object v0

    return-object v0
.end method

.method private getOptionMapper()Lcom/ibotta/android/graphql/mapper/OptionMapper;
    .locals 1

    .line 1287
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1288
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1287
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;->proxyProvideOptionMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OptionMapper;

    move-result-object v0

    return-object v0
.end method

.method private getProductGroupMapper()Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;
    .locals 1

    .line 1302
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1303
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1302
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;->proxyProvideProductGroupMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

    move-result-object v0

    return-object v0
.end method

.method private getProductMapper()Lcom/ibotta/android/graphql/mapper/ProductMapper;
    .locals 1

    .line 1354
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1355
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1354
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;->proxyProvideProductMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/ProductMapper;

    move-result-object v0

    return-object v0
.end method

.method private getQuestMapper()Lcom/ibotta/android/graphql/mapper/QuestMapper;
    .locals 1

    .line 1321
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1322
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1321
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;->proxyProvideQuestMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/QuestMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRecentSearchService()Lcom/ibotta/android/search/RecentSearchService;
    .locals 2

    .line 1402
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRecentSearchTermDao()Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    .line 1401
    invoke-static {v0, v1}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchServiceFactory;->proxyProvideRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/RecentSearchService;

    move-result-object v0

    return-object v0
.end method

.method private getRecentSearchTermDao()Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 1

    .line 1396
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRecentSearchDatabaseProvider:Ljavax/inject/Provider;

    .line 1397
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/search/recent/RecentSearchDatabase;

    .line 1396
    invoke-static {v0}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDaoFactory;->proxyProvideRecentSearchDao(Lcom/ibotta/android/search/recent/RecentSearchDatabase;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerBarcodeConfigurationMapper()Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;
    .locals 2

    .line 1266
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1268
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerBarcodeScanTypeMapper()Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;

    move-result-object v1

    .line 1267
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;->proxyProvideRetailerBarcodeConfigurationMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;)Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerBarcodeScanTypeMapper()Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;
    .locals 1

    .line 1261
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1262
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;->proxyProvideRetailerBarcodeScanTypeMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerBarcodeScanTypeMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerCategoryMapper()Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;
    .locals 1

    .line 1359
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1360
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1359
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;->proxyProvideRetailerCategoryMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 7

    .line 1277
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1278
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    .line 1279
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getButtonInfoMapper()Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    move-result-object v2

    .line 1280
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFeatureMapper()Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    move-result-object v3

    .line 1281
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerBarcodeConfigurationMapper()Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    move-result-object v4

    .line 1282
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerRedemptionMetaMapper()Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object v5

    .line 1283
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getSortResultMapper()Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    move-result-object v6

    .line 1277
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->proxyProvideRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerRedemptionMetaMapper()Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
    .locals 1

    .line 1272
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1273
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->proxyProvideRetailerRedemptionMetaMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerSSCardReducer()Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
    .locals 1

    .line 1431
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 1430
    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSSCardReducerFactory;->proxyProvideRetailerSSCardReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object v0

    return-object v0
.end method

.method private getRewardMapper()Lcom/ibotta/android/graphql/mapper/RewardMapper;
    .locals 3

    .line 1297
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1298
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferRewardQuestionMapper()Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    move-result-object v1

    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOptionMapper()Lcom/ibotta/android/graphql/mapper/OptionMapper;

    move-result-object v2

    .line 1297
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;->proxyProvideRewardMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/RewardMapper;

    move-result-object v0

    return-object v0
.end method

.method private getRoutingUriProcessor()Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;
    .locals 3

    .line 1187
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRouteHandler()Lcom/ibotta/android/routing/RouteHandler;

    move-result-object v2

    .line 1186
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutingUriProcessorFactory;->proxyProvideRoutingUriProcessor(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    move-result-object v0

    return-object v0
.end method

.method private getSortResultMapper()Lcom/ibotta/android/graphql/mapper/SortResultMapper;
    .locals 1

    .line 1251
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1252
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 1251
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;->proxyProvideSortResultMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    move-result-object v0

    return-object v0
.end method

.method private getStripe()Lcom/stripe/android/Stripe;
    .locals 2

    .line 1421
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    .line 1422
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v1

    .line 1421
    invoke-static {v0, v1}, Lcom/ibotta/android/di/PwiModule_ProvideStripeClientFactory;->proxyProvideStripeClient(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/stripe/android/Stripe;

    move-result-object v0

    return-object v0
.end method

.method private getStripeManager()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;
    .locals 1

    .line 1426
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getStripe()Lcom/stripe/android/Stripe;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/di/PwiModule_ProvideStripeManagerFactory;->proxyProvideStripeManager(Lcom/stripe/android/Stripe;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    move-result-object v0

    return-object v0
.end method

.method private getTelephonyManager()Landroid/telephony/TelephonyManager;
    .locals 1

    .line 1196
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1197
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 1196
    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;->proxyProvideTelephonyManager(Landroid/content/Context;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    return-object v0
.end method

.method private getTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;
    .locals 5

    .line 1226
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getNamedTrackingClient()Lcom/ibotta/android/tracking/TrackingClient;

    move-result-object v0

    .line 1227
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 1228
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScreenNameMapProvider:Ljavax/inject/Provider;

    .line 1229
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 1230
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 1225
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/AopModule_ProvideTrackingAdviceFactoryFactory;->proxyProvideTrackingAdviceFactory(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;Landroid/content/res/Resources;)Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;

    move-result-object v0

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V
    .locals 9

    .line 1436
    invoke-static {p1}, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->access$100(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)Lcom/ibotta/android/App;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1437
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1439
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;

    move-result-object p1

    .line 1438
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateSharedPrefsProvider:Ljavax/inject/Provider;

    .line 1440
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateSharedPrefsProvider:Ljavax/inject/Provider;

    .line 1441
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    .line 1442
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    .line 1444
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideProfileDebugStateCallbackFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideProfileDebugStateCallbackFactory;

    move-result-object p1

    .line 1443
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProfileDebugStateCallbackProvider:Ljavax/inject/Provider;

    .line 1445
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProfileDebugStateCallbackProvider:Ljavax/inject/Provider;

    .line 1447
    invoke-static {p1, v0}, Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideBuildProfileFactory;

    move-result-object p1

    .line 1446
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 1449
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1450
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideContextFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1451
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    .line 1453
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;

    move-result-object p1

    .line 1452
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTMonitorClientProvider:Ljavax/inject/Provider;

    .line 1455
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1457
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideAppStateRetainedSharedPreferencesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppStateRetainedSharedPreferencesFactory;

    move-result-object p1

    .line 1456
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1459
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    .line 1460
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1462
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideConfigParserHolderFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideConfigParserHolderFactory;

    move-result-object p1

    .line 1461
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideConfigParserHolderProvider:Ljavax/inject/Provider;

    .line 1464
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideConfigParserHolderProvider:Ljavax/inject/Provider;

    .line 1466
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;

    move-result-object p1

    .line 1465
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1470
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1472
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;

    move-result-object p1

    .line 1471
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingEventDatabaseProvider:Ljavax/inject/Provider;

    .line 1473
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingEventDatabaseProvider:Ljavax/inject/Provider;

    .line 1474
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingEventDaoProvider:Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;

    .line 1475
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingEventDaoProvider:Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;

    .line 1476
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoomKeyValuePersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;

    .line 1478
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1479
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSharedPrefsLastKeyPersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;

    .line 1480
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSharedPrefsLastKeyPersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;

    .line 1481
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideAtomicBoundedIntegerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideAtomicBoundedIntegerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAtomicBoundedIntegerProvider:Lcom/ibotta/android/di/TrackingModule_ProvideAtomicBoundedIntegerFactory;

    .line 1483
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoomKeyValuePersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSharedPrefsLastKeyPersistenceProvider:Lcom/ibotta/android/di/TrackingModule_ProvideSharedPrefsLastKeyPersistenceFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAtomicBoundedIntegerProvider:Lcom/ibotta/android/di/TrackingModule_ProvideAtomicBoundedIntegerFactory;

    .line 1485
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;

    move-result-object p1

    .line 1484
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 1489
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    .line 1490
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1492
    invoke-static {p1}, Lcom/ibotta/android/di/CacheModule_ProvideCacheTimesSharedPreferencesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheTimesSharedPreferencesFactory;

    move-result-object p1

    .line 1491
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheTimesSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1493
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1494
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheDirInternalProvider:Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;

    .line 1495
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1497
    invoke-static {p1}, Lcom/ibotta/android/di/CacheModule_ProvideCachePoliciesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCachePoliciesFactory;

    move-result-object p1

    .line 1496
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCachePoliciesProvider:Ljavax/inject/Provider;

    .line 1499
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideAppTimingTrackerFactory;->create()Lcom/ibotta/android/di/MiscModule_ProvideAppTimingTrackerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppTimingTrackerProvider:Ljavax/inject/Provider;

    .line 1500
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    .line 1501
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1503
    invoke-static {p1, v0}, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;

    move-result-object p1

    .line 1502
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppUpgraderProvider:Ljavax/inject/Provider;

    .line 1505
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheTimesSharedPreferencesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheDirInternalProvider:Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCachePoliciesProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppUpgraderProvider:Ljavax/inject/Provider;

    .line 1507
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;

    move-result-object p1

    .line 1506
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    .line 1514
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    .line 1516
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;

    move-result-object p1

    .line 1515
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheCallbackProvider:Ljavax/inject/Provider;

    .line 1517
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1518
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideSecureStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideSecureStateFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSecureStateProvider:Ljavax/inject/Provider;

    .line 1519
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSecureStateProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1521
    invoke-static {p1, v0}, Lcom/ibotta/android/di/StateModule_ProvideEmailStateFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideEmailStateFactory;

    move-result-object p1

    .line 1520
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEmailStateProvider:Ljavax/inject/Provider;

    .line 1523
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1524
    invoke-static {p1}, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 1525
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheCallbackProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEmailStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 1527
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUserStateAppCallbackFactory;

    move-result-object p1

    .line 1526
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateAppCallbackProvider:Ljavax/inject/Provider;

    .line 1532
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    .line 1534
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideGlobalEventManagerFactory;

    move-result-object p1

    .line 1533
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    .line 1536
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1538
    invoke-static {p1}, Lcom/ibotta/android/di/MiscModule_ProvideStorageSiloStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideStorageSiloStateFactory;

    move-result-object p1

    .line 1537
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStorageSiloStateProvider:Ljavax/inject/Provider;

    .line 1540
    invoke-static {}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;->create()Lcom/ibotta/android/di/AppGeofenceModule_ProvideLocationStatusDispatcherFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 1541
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateAppCallbackProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStorageSiloStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppUpgraderProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 1543
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUserStateFactory;

    move-result-object p1

    .line 1542
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 1551
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1552
    invoke-static {p1}, Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExpirationDateFormatSupplierProvider:Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;

    .line 1553
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1554
    invoke-static {p1}, Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    .line 1555
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExpirationDateFormatSupplierProvider:Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    .line 1556
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    .line 1561
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    .line 1563
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideSessionStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideSessionStateFactory;

    move-result-object p1

    .line 1562
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSessionStateProvider:Ljavax/inject/Provider;

    .line 1564
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1566
    invoke-static {p1}, Lcom/ibotta/android/di/HardwareModule_ProvideDeviceSecurityFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/HardwareModule_ProvideDeviceSecurityFactory;

    move-result-object p1

    .line 1565
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceSecurityProvider:Ljavax/inject/Provider;

    .line 1567
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1569
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideGoogleStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideGoogleStateFactory;

    move-result-object p1

    .line 1568
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    .line 1571
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1572
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTelephonyManagerProvider:Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;

    .line 1574
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideEventIdCounterAtomicIntegerFactory;->create()Lcom/ibotta/android/di/TrackingModule_ProvideEventIdCounterAtomicIntegerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventIdCounterAtomicIntegerProvider:Ljavax/inject/Provider;

    .line 1575
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSessionStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceSecurityProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTelephonyManagerProvider:Lcom/ibotta/android/di/AppModule_ProvideTelephonyManagerFactory;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventIdCounterAtomicIntegerProvider:Ljavax/inject/Provider;

    .line 1576
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventBodyFactoryProvider:Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

    .line 1585
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventBodyFactoryProvider:Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

    .line 1586
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideV1TrackingClientProvider:Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;

    .line 1590
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTMonitorClientProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideV1TrackingClientProvider:Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;

    .line 1592
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;

    move-result-object p1

    .line 1591
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 1599
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    .line 1600
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideImageCacheFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 1602
    invoke-static {}, Lcom/ibotta/android/di/PwiModule_ProvidePwiRetailersHolderFactory;->create()Lcom/ibotta/android/di/PwiModule_ProvidePwiRetailersHolderFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiRetailersHolderProvider:Ljavax/inject/Provider;

    .line 1604
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideRetailerHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideRetailerHelperFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 1605
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExpirationDateFormatSupplierProvider:Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 1607
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/MiscModule_ProvideFormattingFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideFormattingFactory;

    move-result-object p1

    .line 1606
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1611
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 1613
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;

    move-result-object p1

    .line 1612
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 1620
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1622
    invoke-static {p1}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;

    move-result-object p1

    .line 1621
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkStorageProvider:Ljavax/inject/Provider;

    .line 1624
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideTaskHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideTaskHelperFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTaskHelperProvider:Ljavax/inject/Provider;

    .line 1625
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTaskHelperProvider:Ljavax/inject/Provider;

    .line 1627
    invoke-static {p1, v0}, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;

    move-result-object p1

    .line 1626
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 1629
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1631
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;

    move-result-object p1

    .line 1630
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferEvictionPolicyProvider:Ljavax/inject/Provider;

    .line 1634
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->create()Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    .line 1635
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferEvictionPolicyProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1637
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactoryFactory;

    move-result-object p1

    .line 1636
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheFactoryProvider:Ljavax/inject/Provider;

    .line 1641
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheFactoryProvider:Ljavax/inject/Provider;

    .line 1642
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    .line 1644
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceLockFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceLockFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceLockProvider:Ljavax/inject/Provider;

    .line 1646
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    .line 1647
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    .line 1649
    invoke-static {p1}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;

    move-result-object p1

    .line 1648
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConProduceConditionProvider:Ljavax/inject/Provider;

    .line 1652
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideAsyncGroupManagerFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideAsyncGroupManagerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    .line 1654
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkExecutorServiceProvider:Ljavax/inject/Provider;

    .line 1656
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideExecServiceManagerFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideExecServiceManagerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    .line 1657
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceLockProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConProduceConditionProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkExecutorServiceProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    .line 1658
    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkSubmitterProvider:Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

    .line 1668
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkSubmitterProvider:Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

    .line 1669
    invoke-static {p1, v0, v1, v2, v3}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearJobFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;

    .line 1675
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearJobFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;

    .line 1677
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;

    move-result-object p1

    .line 1676
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearRunnableFactoryProvider:Ljavax/inject/Provider;

    .line 1685
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1687
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideFcmStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideFcmStateFactory;

    move-result-object p1

    .line 1686
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmStateProvider:Ljavax/inject/Provider;

    .line 1689
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearRunnableFactoryProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmStateProvider:Ljavax/inject/Provider;

    .line 1691
    invoke-static {p1, v0}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;

    move-result-object p1

    .line 1690
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearHelperProvider:Ljavax/inject/Provider;

    .line 1693
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1694
    invoke-static {p1}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultNotificationChannelIdProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;

    .line 1696
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultNotificationChannelIdProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;

    .line 1697
    invoke-static {p1}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultNotificationComposerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;

    .line 1699
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultNotificationChannelIdProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationChannelIdFactory;

    .line 1700
    invoke-static {p1, v0}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationManagerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;

    .line 1702
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultNotificationComposerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationManagerProvider:Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;

    .line 1703
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStatusBarNotificationHelperProvider:Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;

    .line 1708
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    .line 1710
    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;

    move-result-object p1

    .line 1709
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingProvider:Ljavax/inject/Provider;

    .line 1711
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStatusBarNotificationHelperProvider:Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingProvider:Ljavax/inject/Provider;

    .line 1713
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;

    move-result-object p1

    .line 1712
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePushMessagingProvider:Ljavax/inject/Provider;

    .line 1718
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocaleProvider:Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;

    .line 1719
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1721
    invoke-static {p1, v0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceConfigHelperFactory;

    move-result-object p1

    .line 1720
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceConfigHelperProvider:Ljavax/inject/Provider;

    .line 1723
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceConfigHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateProvider:Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;

    .line 1725
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;

    move-result-object p1

    .line 1724
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceConfigProvider:Ljavax/inject/Provider;

    .line 1731
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideApiCallFactoryFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideApiCallFactoryFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiCallFactoryProvider:Ljavax/inject/Provider;

    .line 1732
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiCallFactoryProvider:Ljavax/inject/Provider;

    .line 1734
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideAuthManagerFactory;

    move-result-object p1

    .line 1733
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    .line 1736
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    .line 1738
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;

    move-result-object p1

    .line 1737
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceStatusListenerProvider:Ljavax/inject/Provider;

    .line 1742
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocaleProvider:Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceConfigProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceStatusListenerProvider:Ljavax/inject/Provider;

    .line 1744
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusManagerFactory;

    move-result-object p1

    .line 1743
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceStatusManagerProvider:Ljavax/inject/Provider;

    .line 1753
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRadarGeofenceStatusManagerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 1755
    invoke-static {p1, v0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;

    move-result-object p1

    .line 1754
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 1758
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1760
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;

    move-result-object p1

    .line 1759
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsStateProvider:Ljavax/inject/Provider;

    .line 1762
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 1764
    invoke-static {p1}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;

    move-result-object p1

    .line 1763
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;

    .line 1766
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;

    .line 1768
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;

    move-result-object p1

    .line 1767
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkReceiverProvider:Ljavax/inject/Provider;

    .line 1772
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 1773
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStoragePrefsFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStoragePrefsFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStoragePrefsProvider:Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStoragePrefsFactory;

    .line 1774
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStoragePrefsProvider:Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStoragePrefsFactory;

    .line 1776
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideDebugFeatureFlagStorageFactory;

    move-result-object p1

    .line 1775
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStorageProvider:Ljavax/inject/Provider;

    .line 1779
    invoke-static {}, Lcom/ibotta/android/di/VariantModule_ProvideMvtTestsHolderFactory;->create()Lcom/ibotta/android/di/VariantModule_ProvideMvtTestsHolderFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtTestsHolderProvider:Ljavax/inject/Provider;

    .line 1780
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 1782
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;

    move-result-object p1

    .line 1781
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    .line 1784
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->create()Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSemverFactoryProvider:Ljavax/inject/Provider;

    .line 1785
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSemverFactoryProvider:Ljavax/inject/Provider;

    .line 1787
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MiscModule_ProvideAppSemverFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideAppSemverFactory;

    move-result-object p1

    .line 1786
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppSemverProvider:Ljavax/inject/Provider;

    .line 1789
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStorageProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppSemverProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSemverFactoryProvider:Ljavax/inject/Provider;

    .line 1791
    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/VariantModule_ProvideRuleEvaluatorFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideRuleEvaluatorFactoryFactory;

    move-result-object p1

    .line 1790
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRuleEvaluatorFactoryProvider:Ljavax/inject/Provider;

    .line 1801
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStorageProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    .line 1803
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;

    move-result-object p1

    .line 1802
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVariantSelectorFactoryProvider:Ljavax/inject/Provider;

    .line 1808
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRuleEvaluatorFactoryProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVariantSelectorFactoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    .line 1810
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/VariantModule_ProvideVariantChainFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideVariantChainFactoryFactory;

    move-result-object p1

    .line 1809
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVariantChainFactoryProvider:Ljavax/inject/Provider;

    .line 1814
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRuleEvaluatorFactoryProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVariantSelectorFactoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVariantChainFactoryProvider:Ljavax/inject/Provider;

    .line 1816
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/VariantModule_ProvideRootVariantSelectorFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideRootVariantSelectorFactoryFactory;

    move-result-object p1

    .line 1815
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRootVariantSelectorFactoryProvider:Ljavax/inject/Provider;

    .line 1820
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRootVariantSelectorFactoryProvider:Ljavax/inject/Provider;

    .line 1822
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigFactoryFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTestConfigFactoryFactory;

    move-result-object p1

    .line 1821
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1824
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1825
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailersVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantSelectorFactory;

    .line 1827
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1828
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAllGalleryTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryTestConfigFactory;

    .line 1829
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1830
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAlsoBoughtViewedVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantSelectorFactory;

    .line 1832
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1833
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvidePwiTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvidePwiTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiTestConfigFactory;

    return-void
.end method

.method private initialize2(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V
    .locals 14

    .line 1838
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1839
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayhouseConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayhouseConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiPlayhouseConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayhouseConfigFactory;

    .line 1840
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1841
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionPrimersTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersTestConfigFactory;

    .line 1843
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1844
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideTeamworkEnabledTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTeamworkEnabledTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTeamworkEnabledTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTeamworkEnabledTestConfigFactory;

    .line 1846
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1847
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoyaltyLinkTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkTestConfigFactory;

    .line 1848
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1849
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountBadgeTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountBadgeTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideToolbarAmountBadgeTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountBadgeTestConfigFactory;

    .line 1851
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1852
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailerCategoriesTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesTestConfigFactory;

    .line 1854
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1855
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideProductsInSearchTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideProductsInSearchTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductsInSearchTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideProductsInSearchTestConfigFactory;

    .line 1857
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1858
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideMcommPercentCashBackTestConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideMcommPercentCashBackTestConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMcommPercentCashBackTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideMcommPercentCashBackTestConfigFactory;

    .line 1860
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1861
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideLoadNotificationsVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideLoadNotificationsVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadNotificationsVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadNotificationsVariantSelectorFactory;

    .line 1863
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1864
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerIconOnOfferVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantSelectorFactory;

    .line 1866
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1867
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadRecentSearchIconShownVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadRecentSearchIconShownVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTypeAheadRecentSearchIconShownVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadRecentSearchIconShownVariantSelectorFactory;

    .line 1869
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1870
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideAppPickerVariantSelectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideAppPickerVariantSelectorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppPickerVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAppPickerVariantSelectorFactory;

    .line 1872
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1873
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowConfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowConfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlippedFlowConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowConfigFactory;

    .line 1874
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigFactoryProvider:Ljavax/inject/Provider;

    .line 1875
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadHighlightingConnfigFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadHighlightingConnfigFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTypeAheadHighlightingConnfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadHighlightingConnfigFactory;

    const/16 p1, 0x12

    .line 1878
    invoke-static {p1}, Ldagger/internal/MapFactory;->builder(I)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "load_retailers"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailersVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantSelectorFactory;

    .line 1879
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "show_all_retailer"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAllGalleryTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideAllGalleryTestConfigFactory;

    .line 1880
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "shoppers_also_viewed_v2"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAlsoBoughtViewedVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantSelectorFactory;

    .line 1881
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "pwi"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiTestConfigFactory;

    .line 1882
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "pwi_playhouse"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiPlayhouseConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayhouseConfigFactory;

    .line 1883
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "permission_primers"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionPrimersTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersTestConfigFactory;

    .line 1884
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "teamwork_enabled"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTeamworkEnabledTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTeamworkEnabledTestConfigFactory;

    .line 1885
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "loyalty_link_call_to_action"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoyaltyLinkTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkTestConfigFactory;

    .line 1886
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "amt_badge_on_title_bar"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideToolbarAmountBadgeTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountBadgeTestConfigFactory;

    .line 1887
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "retailer_categories_in_content_service"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailerCategoriesTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesTestConfigFactory;

    .line 1888
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "products_in_search"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductsInSearchTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideProductsInSearchTestConfigFactory;

    .line 1891
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "mcomm_percent_cash_back"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMcommPercentCashBackTestConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideMcommPercentCashBackTestConfigFactory;

    .line 1892
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "graphql_notifications"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadNotificationsVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadNotificationsVariantSelectorFactory;

    .line 1893
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "retailer_icons_on_offers"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerIconOnOfferVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantSelectorFactory;

    .line 1894
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "typeahead_recent_icon"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTypeAheadRecentSearchIconShownVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadRecentSearchIconShownVariantSelectorFactory;

    .line 1895
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "retailer_picker"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppPickerVariantSelectorProvider:Lcom/ibotta/android/di/VariantModule_ProvideAppPickerVariantSelectorFactory;

    .line 1898
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "flipped_flow"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlippedFlowConfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowConfigFactory;

    .line 1899
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    const-string v0, "typeahead_highlighting"

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTypeAheadHighlightingConnfigProvider:Lcom/ibotta/android/di/VariantModule_ProvideTypeAheadHighlightingConnfigFactory;

    .line 1900
    invoke-virtual {p1, v0, v1}, Ldagger/internal/MapFactory$Builder;->put(Ljava/lang/Object;Ljavax/inject/Provider;)Ldagger/internal/MapFactory$Builder;

    move-result-object p1

    .line 1901
    invoke-virtual {p1}, Ldagger/internal/MapFactory$Builder;->build()Ldagger/internal/MapFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->namedMapOfStringAndTestConfigProvider:Ljavax/inject/Provider;

    .line 1902
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->namedMapOfStringAndTestConfigProvider:Ljavax/inject/Provider;

    .line 1904
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;

    move-result-object p1

    .line 1903
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigRegistryProvider:Ljavax/inject/Provider;

    .line 1906
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigRegistryProvider:Ljavax/inject/Provider;

    .line 1908
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideFeatureFactoryFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideFeatureFactoryFactory;

    move-result-object p1

    .line 1907
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 1909
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 1910
    invoke-static {p1}, Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailersVariantProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;

    .line 1911
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkReceiverProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailersVariantProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;

    .line 1913
    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideFavoriteRetailerSettingsFlushWorkerFactory;

    move-result-object p1

    .line 1912
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    .line 1923
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkReceiverProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTMonitorClientProvider:Ljavax/inject/Provider;

    .line 1925
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;

    move-result-object p1

    .line 1924
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 1932
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 1934
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;

    move-result-object p1

    .line 1933
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkersProvider:Ljavax/inject/Provider;

    .line 1937
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 1939
    invoke-static {p1, v0}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;

    move-result-object p1

    .line 1938
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    .line 1941
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsStateProvider:Ljavax/inject/Provider;

    .line 1943
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePermissionsHelperFactoryFactory;

    move-result-object p1

    .line 1942
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;

    .line 1945
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;

    .line 1947
    invoke-static {p1}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyMultitonFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyMultitonFactory;

    move-result-object p1

    .line 1946
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionStrategyMultitonProvider:Ljavax/inject/Provider;

    .line 1949
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionStrategyMultitonProvider:Ljavax/inject/Provider;

    .line 1951
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePermissionStrategyManagerFactory;

    move-result-object p1

    .line 1950
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionStrategyManagerProvider:Ljavax/inject/Provider;

    .line 1953
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheDirInternalProvider:Lcom/ibotta/android/di/AppModule_ProvideAppCacheDirInternalFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    .line 1955
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;

    move-result-object p1

    .line 1954
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheStateProvider:Ljavax/inject/Provider;

    .line 1960
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    .line 1962
    invoke-static {p1}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;

    move-result-object p1

    .line 1961
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppDetectorProvider:Ljavax/inject/Provider;

    .line 1966
    invoke-static {}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->create()Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;

    move-result-object p1

    .line 1965
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppEventFactoryProvider:Ljavax/inject/Provider;

    .line 1967
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppEventFactoryProvider:Ljavax/inject/Provider;

    .line 1969
    invoke-static {p1, v0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;

    move-result-object p1

    .line 1968
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppTrackerProvider:Ljavax/inject/Provider;

    .line 1971
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppDetectorProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppTrackerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 1973
    invoke-static {p1, v0, v1, v2, v3}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;

    move-result-object p1

    .line 1972
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppCheckerProvider:Ljavax/inject/Provider;

    .line 1979
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingEventDaoProvider:Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDaoFactory;

    .line 1982
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideWorkManagerFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideWorkManagerFactory;

    move-result-object v0

    .line 1981
    invoke-static {p1, v0}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomTrackingFlushSchedulerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideRoomTrackingFlushSchedulerFactory;

    move-result-object p1

    .line 1980
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoomTrackingFlushSchedulerProvider:Ljavax/inject/Provider;

    .line 1983
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionStrategyManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSessionStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppCheckerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEventBodyFactoryProvider:Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoomTrackingFlushSchedulerProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;

    .line 1985
    invoke-static/range {v0 .. v11}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideIbottaLifecycleTrackerFactory;

    move-result-object p1

    .line 1984
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 1999
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFrontDoorActivitiesProvider:Ljavax/inject/Provider;

    .line 2000
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    .line 2002
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;

    move-result-object p1

    .line 2001
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2009
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiCallFactoryProvider:Ljavax/inject/Provider;

    .line 2010
    invoke-static {p1}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiJobFactoryProvider:Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;

    .line 2011
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiJobFactoryProvider:Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;

    .line 2013
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAppConfigCriticalDependencyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAppConfigCriticalDependencyFactory;

    move-result-object p1

    .line 2012
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2016
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideDefaultOkHttpClientFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideDefaultOkHttpClientFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultOkHttpClientProvider:Ljavax/inject/Provider;

    .line 2018
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiContextFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideApiContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiContextProvider:Ljavax/inject/Provider;

    .line 2020
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideHttpHeadersFactory;->create()Lcom/ibotta/android/di/AppApiModule_ProvideHttpHeadersFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpHeadersProvider:Ljavax/inject/Provider;

    .line 2021
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpHeadersProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2023
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideIbottaHeaderInterceptorFactory;

    move-result-object p1

    .line 2022
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaHeaderInterceptorProvider:Ljavax/inject/Provider;

    .line 2028
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideModulesSaltInterceptorFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideModulesSaltInterceptorProvider:Ljavax/inject/Provider;

    .line 2029
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 2030
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideChuckInterceptorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideChuckInterceptorFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideChuckInterceptorProvider:Ljavax/inject/Provider;

    .line 2031
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultOkHttpClientProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaHeaderInterceptorProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideModulesSaltInterceptorProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideChuckInterceptorProvider:Ljavax/inject/Provider;

    .line 2033
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppOkHttpClientFactory;

    move-result-object p1

    .line 2032
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppOkHttpClientProvider:Ljavax/inject/Provider;

    .line 2039
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheStoreFactory;->create()Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheStoreFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpCacheStoreProvider:Ljavax/inject/Provider;

    .line 2040
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpCacheStoreProvider:Ljavax/inject/Provider;

    .line 2042
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;

    move-result-object p1

    .line 2041
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpCacheProvider:Ljavax/inject/Provider;

    .line 2044
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyResolverFactory;->create()Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyResolverFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyResolverProvider:Ljavax/inject/Provider;

    .line 2045
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2047
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;

    move-result-object p1

    .line 2046
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaApolloLoggerProvider:Ljavax/inject/Provider;

    .line 2048
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppOkHttpClientProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHttpCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheFactoryProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyResolverProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaApolloLoggerProvider:Ljavax/inject/Provider;

    .line 2050
    invoke-static {p1, v0, v1, v2, v3}, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;

    move-result-object p1

    .line 2049
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApolloClientProvider:Ljavax/inject/Provider;

    .line 2056
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2057
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonInfoMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;

    .line 2058
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2059
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    .line 2060
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    .line 2061
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

    .line 2063
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2064
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerBarcodeScanTypeMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;

    .line 2065
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerBarcodeScanTypeMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeScanTypeMapperFactory;

    .line 2066
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerBarcodeConfigurationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;

    .line 2068
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2069
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerRedemptionMetaMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;

    .line 2070
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonInfoMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerBarcodeConfigurationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerBarcodeConfigurationMapperFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerRedemptionMetaMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    .line 2071
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    .line 2078
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2079
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

    .line 2080
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

    .line 2081
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferRewardQuestionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;

    .line 2083
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferRewardQuestionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

    .line 2084
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRewardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;

    .line 2088
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2089
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductGroupMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;

    .line 2090
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2091
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAvailableAtRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;

    .line 2092
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRewardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRewardMapperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductGroupMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductGroupMapperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonInfoMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideButtonInfoMapperFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAvailableAtRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideAvailableAtRetailerMapperFactory;

    .line 2093
    invoke-static {p1, v0, v1, v2, v3}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

    .line 2099
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2100
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideQuestMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;

    .line 2101
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2102
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusQualificationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;

    .line 2103
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideQuestMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideQuestMapperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusQualificationMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    .line 2104
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

    .line 2109
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

    .line 2110
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;

    .line 2112
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2113
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryWithReferencesMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;

    .line 2115
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    .line 2116
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;

    .line 2118
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2119
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;

    .line 2120
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2121
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;

    .line 2122
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedRetailerMapperFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryMapperFactory;

    .line 2123
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideModuleMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;

    .line 2132
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    .line 2133
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuyableGiftCardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;

    .line 2135
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2136
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuyableGiftCardRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;

    .line 2137
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSortResultMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideSortResultMapperFactory;

    .line 2138
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;

    .line 2140
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferRewardQuestionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferRewardQuestionMapperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOptionMapperFactory;

    .line 2141
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEngagementMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;

    .line 2145
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2147
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerNodeMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerNodeMapperFactory;

    move-result-object p1

    .line 2146
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerNodeMapperProvider:Ljavax/inject/Provider;

    .line 2148
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerNodeMapperProvider:Ljavax/inject/Provider;

    .line 2150
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerFavoriteRetailerMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideCustomerFavoriteRetailerMapperFactory;

    move-result-object p1

    .line 2149
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;

    .line 2152
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;

    .line 2154
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;

    move-result-object p1

    .line 2153
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerNodeMapperProvider:Ljavax/inject/Provider;

    .line 2156
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2158
    invoke-static {p1}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedBannerNodeMapperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedBannerNodeMapperFactory;

    move-result-object p1

    .line 2157
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedBannerNodeMapperProvider:Ljavax/inject/Provider;

    .line 2159
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerNodeMapperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedBannerNodeMapperProvider:Ljavax/inject/Provider;

    .line 2161
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;

    move-result-object p1

    .line 2160
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedNodeMapperProvider:Ljavax/inject/Provider;

    .line 2165
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerNodeMapperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeaturedNodeMapperProvider:Ljavax/inject/Provider;

    .line 2167
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryNodeMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerCategoryNodeMapperFactory;

    move-result-object p1

    .line 2166
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoryNodeMapperProvider:Ljavax/inject/Provider;

    .line 2171
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferMapperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryWithReferencesMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideFeatureMapperFactory;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideModuleMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideProductMapperFactory;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuyableGiftCardMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardMapperFactory;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuyableGiftCardRetailerMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideBuyableGiftCardRetailerMapperFactory;

    iget-object v10, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideDealMapperFactory;

    iget-object v11, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEngagementMapperProvider:Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;

    iget-object v12, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerNodeMapperProvider:Ljavax/inject/Provider;

    iget-object v13, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoryNodeMapperProvider:Ljavax/inject/Provider;

    .line 2172
    invoke-static/range {v0 .. v13}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMappersProvider:Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;

    .line 2187
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApolloClientProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMappersProvider:Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideModulesSaltInterceptorProvider:Ljavax/inject/Provider;

    .line 2189
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;

    move-result-object p1

    .line 2188
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 2194
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiRetailersHolderProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 2196
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;

    move-result-object p1

    .line 2195
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2201
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2203
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLaunchDarklyInitializerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLaunchDarklyInitializerFactory;

    move-result-object p1

    .line 2202
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLaunchDarklyInitializerProvider:Ljavax/inject/Provider;

    .line 2205
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLaunchDarklyInitializerProvider:Ljavax/inject/Provider;

    .line 2207
    invoke-static {p1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsApiFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsApiFactory;

    move-result-object p1

    .line 2206
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsApiProvider:Ljavax/inject/Provider;

    .line 2209
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 2211
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideGoogleAIDRetrieverFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideGoogleAIDRetrieverFactory;

    move-result-object p1

    .line 2210
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleAIDRetrieverProvider:Ljavax/inject/Provider;

    .line 2213
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleAIDRetrieverProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2215
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsUserFactoryFactory;

    move-result-object p1

    .line 2214
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsUserFactoryProvider:Ljavax/inject/Provider;

    .line 2220
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsApiProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsUserFactoryProvider:Ljavax/inject/Provider;

    .line 2222
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;

    move-result-object p1

    .line 2221
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2224
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFlagsCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2226
    invoke-static {p1, v0, v1, v2, v3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;

    move-result-object p1

    .line 2225
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAggregateCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2232
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFrontDoorActivitiesProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAggregateCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 2234
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;

    move-result-object p1

    .line 2233
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCriticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 2236
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 2238
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideBreadcrumbSharedPreferencesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideBreadcrumbSharedPreferencesFactory;

    move-result-object p1

    .line 2237
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 2239
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 2241
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideBreadcrumbStorageFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideBreadcrumbStorageFactory;

    move-result-object p1

    .line 2240
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbStorageProvider:Ljavax/inject/Provider;

    .line 2243
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFrontDoorActivitiesProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbStorageProvider:Ljavax/inject/Provider;

    .line 2245
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideBreadcrumbLifecycleTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideBreadcrumbLifecycleTrackerFactory;

    move-result-object p1

    .line 2244
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 2247
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 2249
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;

    move-result-object p1

    .line 2248
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNewRelicSessionAttributesProvider:Ljavax/inject/Provider;

    .line 2253
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNewRelicSessionAttributesProvider:Ljavax/inject/Provider;

    .line 2254
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicLifecycleTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicLifecycleTrackerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNewRelicLifecycleTrackerProvider:Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicLifecycleTrackerFactory;

    .line 2257
    invoke-static {}, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->create()Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppsFlyerStateProvider:Ljavax/inject/Provider;

    .line 2258
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCriticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNewRelicLifecycleTrackerProvider:Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicLifecycleTrackerFactory;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppsFlyerStateProvider:Ljavax/inject/Provider;

    .line 2260
    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;

    move-result-object p1

    .line 2259
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 2271
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 2272
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkCacheRemoverProvider:Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;

    .line 2274
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkStorageProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkCacheRemoverProvider:Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkSubmitterProvider:Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingProvider:Ljavax/inject/Provider;

    .line 2276
    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;

    move-result-object p1

    .line 2275
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkManagerProvider:Ljavax/inject/Provider;

    .line 2287
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 2289
    invoke-static {p1}, Lcom/ibotta/android/di/StateModule_ProvideUpgradeStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUpgradeStateFactory;

    move-result-object p1

    .line 2288
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private initialize3(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)V
    .locals 14

    .line 2295
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    .line 2297
    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConConsumeConditionFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideProdConConsumeConditionFactory;

    move-result-object v0

    .line 2296
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConConsumeConditionProvider:Ljavax/inject/Provider;

    .line 2299
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 2301
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/VerificationModule_ProvideOfferQuantityDatabaseFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VerificationModule_ProvideOfferQuantityDatabaseFactory;

    move-result-object v0

    .line 2300
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferQuantityDatabaseProvider:Ljavax/inject/Provider;

    .line 2304
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideScanRulesFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideScanRulesFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScanRulesProvider:Ljavax/inject/Provider;

    .line 2305
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferQuantityDatabaseProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScanRulesProvider:Ljavax/inject/Provider;

    .line 2307
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;

    move-result-object v0

    .line 2306
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVerificationManagerProvider:Ljavax/inject/Provider;

    .line 2313
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideBackgroundHandlerFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideBackgroundHandlerFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBackgroundHandlerProvider:Ljavax/inject/Provider;

    .line 2314
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 2317
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->create()Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBackgroundHandlerProvider:Ljavax/inject/Provider;

    .line 2315
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmTokenManagerProvider:Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

    .line 2319
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 2321
    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideClearableCookieJarFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideClearableCookieJarFactory;

    move-result-object v0

    .line 2320
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideClearableCookieJarProvider:Ljavax/inject/Provider;

    .line 2322
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideClearableCookieJarProvider:Ljavax/inject/Provider;

    .line 2323
    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideClearCookiesLogOutListenerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideClearCookiesLogOutListenerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideClearCookiesLogOutListenerProvider:Lcom/ibotta/android/di/AppApiModule_ProvideClearCookiesLogOutListenerFactory;

    .line 2325
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 2326
    invoke-static {v0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/PwiModule_ProvidePwiUserStateFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiUserStateProvider:Ljavax/inject/Provider;

    .line 2327
    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVerificationManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionStrategyManagerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkManagerProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmTokenManagerProvider:Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

    iget-object v12, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideClearCookiesLogOutListenerProvider:Lcom/ibotta/android/di/AppApiModule_ProvideClearCookiesLogOutListenerFactory;

    iget-object v13, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiUserStateProvider:Ljavax/inject/Provider;

    .line 2328
    invoke-static/range {v1 .. v13}, Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLogOutListenersProvider:Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;

    .line 2342
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLogOutListenersProvider:Lcom/ibotta/android/di/StateModule_ProvideLogOutListenersFactory;

    .line 2344
    invoke-static {v0, v1}, Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideLogOutManagerFactory;

    move-result-object v0

    .line 2343
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLogOutManagerProvider:Ljavax/inject/Provider;

    .line 2346
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppStateRetainedSharedPreferencesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppUpgraderProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppSemverProvider:Ljavax/inject/Provider;

    .line 2348
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/StateModule_ProvideServerUpgradeStateFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideServerUpgradeStateFactory;

    move-result-object v0

    .line 2347
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideServerUpgradeStateProvider:Ljavax/inject/Provider;

    .line 2354
    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConConsumeConditionProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLogOutManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideServerUpgradeStateProvider:Ljavax/inject/Provider;

    .line 2356
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;

    move-result-object v0

    .line 2355
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideConsumerFactoryProvider:Ljavax/inject/Provider;

    .line 2365
    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConConsumeConditionProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConProduceConditionProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2367
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;

    move-result-object v0

    .line 2366
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProducerFactoryProvider:Ljavax/inject/Provider;

    .line 2374
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceLockProvider:Ljavax/inject/Provider;

    .line 2376
    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkWaitConditionFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkWaitConditionFactory;

    move-result-object v0

    .line 2375
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkWaitConditionProvider:Ljavax/inject/Provider;

    .line 2378
    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideConsumerFactoryProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProducerFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceLockProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkWaitConditionProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    .line 2380
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkServiceExecutorFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkServiceExecutorFactory;

    move-result-object v0

    .line 2379
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceExecutorProvider:Ljavax/inject/Provider;

    .line 2387
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    .line 2388
    invoke-static {v0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AopModule_ProvideStopWatchFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStopWatchProvider:Lcom/ibotta/android/di/AopModule_ProvideStopWatchFactory;

    .line 2389
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStopWatchProvider:Lcom/ibotta/android/di/AopModule_ProvideStopWatchFactory;

    .line 2390
    invoke-static {v0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStopWatchesProvider:Ljavax/inject/Provider;

    .line 2392
    invoke-static {}, Lcom/ibotta/android/di/AopModule_ProvideScreenNameMapFactory;->create()Lcom/ibotta/android/di/AopModule_ProvideScreenNameMapFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScreenNameMapProvider:Ljavax/inject/Provider;

    .line 2394
    invoke-static {}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;->create()Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheExecutorFactoryFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePasswordCacheExecutorFactoryProvider:Ljavax/inject/Provider;

    .line 2395
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePasswordCacheExecutorFactoryProvider:Ljavax/inject/Provider;

    .line 2397
    invoke-static {v0}, Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvidePasswordCacheFactory;

    move-result-object v0

    .line 2396
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePasswordCacheProvider:Ljavax/inject/Provider;

    .line 2400
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiInterceptorFactory;->create()Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiInterceptorFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultApiInterceptorProvider:Ljavax/inject/Provider;

    .line 2401
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultApiInterceptorProvider:Ljavax/inject/Provider;

    .line 2403
    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideDefaultApiFactory;

    move-result-object v0

    .line 2402
    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultApiProvider:Ljavax/inject/Provider;

    .line 2404
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultApiProvider:Ljavax/inject/Provider;

    .line 2406
    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingApiClientFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideTrackingApiClientFactory;

    move-result-object v0

    .line 2405
    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingApiClientProvider:Ljavax/inject/Provider;

    .line 2408
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideOptionHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideOptionHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionHelperProvider:Ljavax/inject/Provider;

    .line 2409
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionHelperProvider:Ljavax/inject/Provider;

    .line 2411
    invoke-static {v0}, Lcom/ibotta/android/di/MiscModule_ProvideGameQuestionDriverFactoryFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideGameQuestionDriverFactoryFactory;

    move-result-object v0

    .line 2410
    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGameQuestionDriverFactoryProvider:Ljavax/inject/Provider;

    .line 2412
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 2414
    invoke-static {v0}, Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/api/di/ApiModule_ProvideBonusHelperFactory;

    move-result-object v0

    .line 2413
    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    .line 2416
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideGiftCardHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideGiftCardHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGiftCardHelperProvider:Ljavax/inject/Provider;

    .line 2418
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideProductGroupHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideProductGroupHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductGroupHelperProvider:Ljavax/inject/Provider;

    .line 2420
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideOfferCategoryHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideOfferCategoryHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryHelperProvider:Ljavax/inject/Provider;

    .line 2422
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideCategoryHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCategoryHelperProvider:Ljavax/inject/Provider;

    .line 2424
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideEarningsHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEarningsHelperProvider:Ljavax/inject/Provider;

    .line 2426
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerSocialHelperProvider:Ljavax/inject/Provider;

    .line 2427
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideServerUpgradeStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2429
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/StateModule_ProvideUpgradeCheckerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideUpgradeCheckerFactory;

    move-result-object v0

    .line 2428
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeCheckerProvider:Ljavax/inject/Provider;

    .line 2435
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 2436
    invoke-static {v0}, Lcom/ibotta/android/di/MiscModule_ProvideValidationFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideValidationFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideValidationProvider:Ljavax/inject/Provider;

    .line 2437
    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmTokenManagerProvider:Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleAIDRetrieverProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceSecurityProvider:Ljavax/inject/Provider;

    .line 2439
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideDeviceRegistrationFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideDeviceRegistrationFactory;

    move-result-object v0

    .line 2438
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceRegistrationProvider:Ljavax/inject/Provider;

    .line 2446
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceRegistrationProvider:Ljavax/inject/Provider;

    .line 2448
    invoke-static {v0}, Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideDeviceRegistrationAsyncFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/DeviceRegistrationModule_ProvideDeviceRegistrationAsyncFactory;

    move-result-object v0

    .line 2447
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceRegistrationAsyncProvider:Ljavax/inject/Provider;

    .line 2450
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 2452
    invoke-static {v0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideActivityLifecycleListenerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideActivityLifecycleListenerFactory;

    move-result-object v0

    .line 2451
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideActivityLifecycleListenerProvider:Ljavax/inject/Provider;

    .line 2455
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideFileProviderHelperFactory;->create()Lcom/ibotta/android/di/MiscModule_ProvideFileProviderHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFileProviderHelperProvider:Ljavax/inject/Provider;

    .line 2456
    invoke-static {p1}, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->access$100(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)Lcom/ibotta/android/App;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    .line 2458
    invoke-static {}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallRetailerSupportFactory;->create()Lcom/ibotta/android/di/WindfallModule_ProvideWindfallRetailerSupportFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallRetailerSupportProvider:Ljavax/inject/Provider;

    .line 2459
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 2461
    invoke-static {p1, v0}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallReceiptSdkFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/WindfallModule_ProvideWindfallReceiptSdkFactory;

    move-result-object p1

    .line 2460
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallReceiptSdkProvider:Ljavax/inject/Provider;

    .line 2464
    invoke-static {}, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->create()Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppVersionHelperProvider:Ljavax/inject/Provider;

    .line 2465
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppVersionHelperProvider:Ljavax/inject/Provider;

    .line 2467
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistClassifierFactoryFactory;

    move-result-object p1

    .line 2466
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBlacklistClassifierFactoryProvider:Ljavax/inject/Provider;

    .line 2471
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBlacklistClassifierFactoryProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 2473
    invoke-static {p1, v0}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;

    move-result-object p1

    .line 2472
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBlacklistEngineProvider:Ljavax/inject/Provider;

    .line 2475
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallReceiptSdkProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBlacklistEngineProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallRetailerSupportProvider:Ljavax/inject/Provider;

    .line 2477
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/WindfallModule_ProvideWindfallGatekeeperFactory;

    move-result-object p1

    .line 2476
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallGatekeeperProvider:Ljavax/inject/Provider;

    .line 2482
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 2485
    invoke-static {}, Lcom/ibotta/android/di/VerificationModule_ProvideUuidGeneratorFactory;->create()Lcom/ibotta/android/di/VerificationModule_ProvideUuidGeneratorFactory;

    move-result-object v0

    .line 2484
    invoke-static {p1, v0}, Lcom/ibotta/android/di/VerificationModule_ProvideReceiptSubmissionHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VerificationModule_ProvideReceiptSubmissionHelperFactory;

    move-result-object p1

    .line 2483
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideReceiptSubmissionHelperProvider:Ljavax/inject/Provider;

    .line 2486
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiContextProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideReceiptSubmissionHelperProvider:Ljavax/inject/Provider;

    .line 2488
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/WindfallModule_ProvideWindfallHelperFactory;

    move-result-object p1

    .line 2487
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallHelperProvider:Ljavax/inject/Provider;

    .line 2495
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    .line 2496
    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiLayerNewRelicInterceptorProvider:Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;

    .line 2497
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDefaultOkHttpClientProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideChuckInterceptorProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiLayerNewRelicInterceptorProvider:Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;

    .line 2499
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideApiOkHttpClientFactory;

    move-result-object p1

    .line 2498
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiOkHttpClientProvider:Ljavax/inject/Provider;

    .line 2503
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 2505
    invoke-static {p1}, Lcom/ibotta/android/di/MiscModule_ProvideRetailerParcelHelperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideRetailerParcelHelperFactory;

    move-result-object p1

    .line 2504
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 2507
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideFavoriteRetailerNotifierFactory;->create()Lcom/ibotta/android/di/MiscModule_ProvideFavoriteRetailerNotifierFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerNotifierProvider:Ljavax/inject/Provider;

    .line 2508
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppboyProvider:Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerNotifierProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    .line 2510
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;

    move-result-object p1

    .line 2509
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerManagerFactoryProvider:Ljavax/inject/Provider;

    .line 2517
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 2519
    invoke-static {p1}, Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDatabaseFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideRecentSearchDatabaseFactory;

    move-result-object p1

    .line 2518
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRecentSearchDatabaseProvider:Ljavax/inject/Provider;

    .line 2520
    invoke-static {}, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->create()Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImUtilProvider:Ljavax/inject/Provider;

    .line 2522
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideApiClientFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideApiClientFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiClientProvider:Ljavax/inject/Provider;

    .line 2524
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideApiExecutionFactoryFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideApiExecutionFactoryFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiExecutionFactoryProvider:Ljavax/inject/Provider;

    .line 2526
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideProductHelperFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductHelperProvider:Ljavax/inject/Provider;

    .line 2527
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductHelperProvider:Ljavax/inject/Provider;

    .line 2529
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;

    move-result-object p1

    .line 2528
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentMapperProvider:Ljavax/inject/Provider;

    .line 2533
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 2535
    invoke-static {p1, v0}, Lcom/ibotta/android/di/MiscModule_ProvideContentHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideContentHelperFactory;

    move-result-object p1

    .line 2534
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentHelperProvider:Ljavax/inject/Provider;

    .line 2537
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideActivityLifecycleListenerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 2538
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteHandlerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;

    .line 2545
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteHandlerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;

    .line 2546
    invoke-static {p1, v0}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoutePreviewerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;

    .line 2548
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRoutePreviewerProvider:Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;

    .line 2550
    invoke-static {p1}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationRoutingUtilFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideNotificationRoutingUtilFactory;

    move-result-object p1

    .line 2549
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationRoutingUtilProvider:Ljavax/inject/Provider;

    .line 2552
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    .line 2554
    invoke-static {p1}, Lcom/ibotta/android/di/SearchModule_ProvideMisspellingReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/SearchModule_ProvideMisspellingReducerFactory;

    move-result-object p1

    .line 2553
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMisspellingReducerProvider:Ljavax/inject/Provider;

    .line 2556
    invoke-static {}, Lcom/ibotta/android/di/SearchModule_ProvideSearchReducerFactory;->create()Lcom/ibotta/android/di/SearchModule_ProvideSearchReducerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSearchReducerProvider:Ljavax/inject/Provider;

    .line 2558
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->create()Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBitmapUtilProvider:Ljavax/inject/Provider;

    .line 2559
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBitmapUtilProvider:Ljavax/inject/Provider;

    .line 2561
    invoke-static {p1}, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;

    move-result-object p1

    .line 2560
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideReceiptProcessingMathProvider:Ljavax/inject/Provider;

    .line 2562
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->create()Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFileIOProvider:Ljavax/inject/Provider;

    .line 2563
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideReceiptProcessingMathProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFileIOProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBitmapUtilProvider:Ljavax/inject/Provider;

    .line 2565
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;

    move-result-object p1

    .line 2564
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePipelineFactoryProvider:Ljavax/inject/Provider;

    .line 2569
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    .line 2570
    invoke-static {p1}, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->getAppsFlyerUIDProvider:Ljavax/inject/Provider;

    .line 2572
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;->create()Lcom/ibotta/api/di/ApiModule_ProvideDigitalProductHelperFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDigitalProductHelperProvider:Ljavax/inject/Provider;

    .line 2573
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    .line 2574
    invoke-static {p1}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTitleBarReducerProvider:Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;

    .line 2575
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiJobFactoryProvider:Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLoadRetailersVariantProvider:Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDigitalProductHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTitleBarReducerProvider:Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;

    .line 2577
    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationDetailFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideNotificationDetailFactoryFactory;

    move-result-object p1

    .line 2576
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationDetailFactoryProvider:Ljavax/inject/Provider;

    .line 2588
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheProvider:Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;

    .line 2589
    invoke-static {p1, v0}, Lcom/ibotta/android/di/CacheModule_ProvideCacheFetchStrategyFactoryFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheFetchStrategyFactoryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheFetchStrategyFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheFetchStrategyFactoryFactory;

    .line 2591
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->applicationProvider:Ljavax/inject/Provider;

    invoke-static {p1}, Lcom/ibotta/android/di/AppModule_ProvideLooperFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideLooperFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLooperProvider:Lcom/ibotta/android/di/AppModule_ProvideLooperFactory;

    .line 2592
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLooperProvider:Lcom/ibotta/android/di/AppModule_ProvideLooperFactory;

    .line 2594
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;

    move-result-object p1

    .line 2593
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationUpdateManagerProvider:Ljavax/inject/Provider;

    .line 2599
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHardwareProvider:Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideHandlerProvider:Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheFetchStrategyFactoryProvider:Lcom/ibotta/android/di/CacheModule_ProvideCacheFetchStrategyFactoryFactory;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationUpdateManagerProvider:Ljavax/inject/Provider;

    .line 2601
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideApiJobEnvironmentFactory;

    move-result-object p1

    .line 2600
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiJobEnvironmentProvider:Ljavax/inject/Provider;

    .line 2610
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    .line 2612
    invoke-static {p1}, Lcom/ibotta/android/di/MiscModule_ProvideBonusBucketedComparatorFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideBonusBucketedComparatorFactory;

    move-result-object p1

    .line 2611
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusBucketedComparatorProvider:Ljavax/inject/Provider;

    .line 2613
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 2615
    invoke-static {p1}, Lcom/ibotta/android/di/ReducerModule_ProvideContentBackgroundReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideContentBackgroundReducerFactory;

    move-result-object p1

    .line 2614
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentBackgroundReducerProvider:Ljavax/inject/Provider;

    .line 2616
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    .line 2618
    invoke-static {p1, v0}, Lcom/ibotta/android/di/ReducerModule_ProvideDebugFeatureFlagReducerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideDebugFeatureFlagReducerFactory;

    move-result-object p1

    .line 2617
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagReducerProvider:Ljavax/inject/Provider;

    .line 2620
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    .line 2622
    invoke-static {p1}, Lcom/ibotta/android/di/ReducerModule_ProvideDealImageReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideDealImageReducerFactory;

    move-result-object p1

    .line 2621
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealImageReducerProvider:Ljavax/inject/Provider;

    .line 2623
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideResourcesProvider:Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;

    .line 2625
    invoke-static {p1}, Lcom/ibotta/android/di/ReducerModule_ProvideDealSummaryReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideDealSummaryReducerFactory;

    move-result-object p1

    .line 2624
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealSummaryReducerProvider:Ljavax/inject/Provider;

    .line 2627
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideBannerReducerFactory;->create()Lcom/ibotta/android/di/ReducerModule_ProvideBannerReducerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBannerReducerProvider:Ljavax/inject/Provider;

    .line 2629
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerCategoriesReducerFactory;->create()Lcom/ibotta/android/di/ReducerModule_ProvideRetailerCategoriesReducerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoriesReducerProvider:Ljavax/inject/Provider;

    .line 2630
    iget-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppHelperProvider:Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusBucketedComparatorProvider:Ljavax/inject/Provider;

    .line 2632
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingUtilFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingUtilFactory;

    move-result-object p1

    .line 2631
    invoke-static {p1}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectAccountProfileView(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4928
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectAnimatedDialog(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4901
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectAppsFlyerRoutingActivity(Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;)Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4537
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 4538
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 4539
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 4540
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkManagerProvider:Ljavax/inject/Provider;

    .line 4541
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 4540
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 4542
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 4543
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 4544
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 4545
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 4546
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    .line 4547
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 4546
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 4548
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4549
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 4550
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingFlushWorkerProvider:Ljavax/inject/Provider;

    .line 4551
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 4550
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 4552
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 4553
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 4554
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 4553
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity_MembersInjector;->injectLifecycleTracker(Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V

    .line 4555
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 4556
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 4555
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;Lcom/ibotta/android/state/user/UserState;)V

    return-object p1
.end method

.method private injectBaseOfferCardView(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4288
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4289
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4290
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/Formatting;)V

    .line 4291
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/os/Handler;)V

    return-object p1
.end method

.method private injectBatteryReceiver(Lcom/ibotta/android/receiver/BatteryReceiver;)Lcom/ibotta/android/receiver/BatteryReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4480
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 4481
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 4480
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/BatteryReceiver_MembersInjector;->injectGeofenceCoordinator(Lcom/ibotta/android/receiver/BatteryReceiver;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V

    return-object p1
.end method

.method private injectBonusDetailView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4403
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4404
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectBonusPickerListView(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;)Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4773
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4774
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4773
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 4778
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideBonusesEventContextProviderFactory;->proxyProvideBonusesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    .line 4775
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView_MembersInjector;->injectEventContextProvider(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object p1
.end method

.method private injectBonusProgressView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4810
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 4811
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectBonusTokenView(Lcom/ibotta/android/view/bonuses/BonusTokenView;)Lcom/ibotta/android/view/bonuses/BonusTokenView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4824
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/common/ProgressCircleView;Lcom/ibotta/android/util/Formatting;)V

    .line 4825
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/common/ProgressCircleView;Landroid/os/Handler;)V

    .line 4826
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 4827
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->injectImageCache(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectBonusView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4817
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 4818
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectBootReceiver(Lcom/ibotta/android/receiver/BootReceiver;)Lcom/ibotta/android/receiver/BootReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4487
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 4488
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 4487
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;->injectGeofenceCoordinator(Lcom/ibotta/android/receiver/BootReceiver;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V

    return-object p1
.end method

.method private injectButtonSdkWelcomeBackDialog(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4656
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 4657
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 4656
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method

.method private injectButtonSdkWelcomeBackUI(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4842
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;->injectTracker(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method

.method private injectCacheClearReceiver(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)Lcom/ibotta/android/receiver/cache/CacheClearReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4466
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearHelperProvider:Ljavax/inject/Provider;

    .line 4467
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/CacheClearHelper;

    .line 4466
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;->injectCacheClearHelper(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;Lcom/ibotta/android/appcache/CacheClearHelper;)V

    return-object p1
.end method

.method private injectCashOutView(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;)Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4943
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4944
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectConnectedAccountsView(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4663
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4664
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4663
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectDebugOverlayService(Lcom/ibotta/android/service/debug/DebugOverlayService;)Lcom/ibotta/android/service/debug/DebugOverlayService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4585
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;->injectAppHelper(Lcom/ibotta/android/service/debug/DebugOverlayService;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectEarningRowView(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4957
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4958
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectEarningsBonusRowView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4833
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    .line 4834
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    .line 4833
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 4835
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4836
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4835
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectEarningsDetailToolbarView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5025
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5026
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5025
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectEarningsOfferRowView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4427
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4428
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4429
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4428
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 4430
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4431
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4430
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4432
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 4433
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 4432
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object p1
.end method

.method private injectFavoriteRetailerModuleView(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4383
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 4384
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 4383
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 4385
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 4386
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 4385
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/android/profile/BuildProfile;)V

    return-object p1
.end method

.method private injectFavoriteView(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5039
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectFcmBroadcastReceiver(Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;)Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4473
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePushMessagingProvider:Ljavax/inject/Provider;

    .line 4474
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    .line 4473
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver_MembersInjector;->injectPushMessaging(Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;Lcom/ibotta/android/service/push/PushMessaging;)V

    return-object p1
.end method

.method private injectFcmIntentService(Lcom/ibotta/android/service/push/FcmIntentService;)Lcom/ibotta/android/service/push/FcmIntentService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4623
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePushMessagingProvider:Ljavax/inject/Provider;

    .line 4624
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    .line 4623
    invoke-static {p1, v0}, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;->injectPushMessaging(Lcom/ibotta/android/service/push/FcmIntentService;Lcom/ibotta/android/service/push/PushMessaging;)V

    return-object p1
.end method

.method private injectFcmTokenCaptureService(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4630
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFcmTokenManager()Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->injectFcmTokenManager(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/ibotta/android/async/device/FcmTokenManager;)V

    .line 4631
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppboy()Lcom/appboy/Appboy;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->injectAppboy(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/appboy/Appboy;)V

    return-object p1
.end method

.method private injectFeaturedListView(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4267
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4268
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectHardware(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 4269
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4270
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4269
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 4271
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4275
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideFeaturedEventContextProviderFactory;->proxyProvideFeaturedEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    .line 4272
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object p1
.end method

.method private injectFeaturedView(Lcom/ibotta/android/view/featured/FeaturedView;)Lcom/ibotta/android/view/featured/FeaturedView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4297
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 4298
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/featured/FeaturedView;Landroid/os/Handler;)V

    .line 4299
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 4300
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFeatureRouteHandler()Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectFeatureRouteHandler(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/view/featured/FeatureRouteHandler;)V

    .line 4301
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectImageCache(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectFindRebatesListView(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4259
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideFindRebatesEventContextProviderFactory;->proxyProvideFindRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    .line 4256
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/EventContextProvider;)V

    .line 4260
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4261
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4260
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method

.method private injectFriendColumnView(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4977
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/util/Formatting;)V

    .line 4978
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectFullImageDialogFragment(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;)Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5004
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5005
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5004
    invoke-static {p1, v0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment_MembersInjector;->injectImageCache(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectFullScreenImageDialog(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5011
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5012
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5011
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectGalleryIntentCreator(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4281
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiRetailersHolderProvider:Ljavax/inject/Provider;

    .line 4282
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 4281
    invoke-static {p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;->injectPwiRetailersHolder(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;)V

    return-object p1
.end method

.method private injectGalleryListView(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4325
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView_MembersInjector;->injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 4326
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4327
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4326
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method

.method private injectGiftCardView(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;)Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4950
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4951
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectGraphQlLoadRetailersVariant(Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;)Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4682
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 4683
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v1

    .line 4682
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant_MembersInjector;->injectInit(Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object p1
.end method

.method private injectGridCardView(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;)Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4364
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4365
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectGridModuleView(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4895
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectHorizScrollingModuleView(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4250
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView_MembersInjector;->injectTitleBarReducer(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object p1
.end method

.method private injectIbottaTrackingFlushWorker(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;
    .locals 3
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4671
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 4673
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideIbottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4674
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingApiClientProvider:Ljavax/inject/Provider;

    .line 4675
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/network/TrackingApiClient;

    .line 4671
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->injectInit(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/network/TrackingApiClient;)V

    return-object p1
.end method

.method private injectIbottaVideoView(Lcom/ibotta/android/view/video/IbottaVideoView;)Lcom/ibotta/android/view/video/IbottaVideoView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4860
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/view/video/IbottaVideoView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object p1
.end method

.method private injectImageCardView(Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;)Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5018
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectInBackgroundApiWorkService(Lcom/ibotta/android/service/api/InBackgroundApiWorkService;)Lcom/ibotta/android/service/api/InBackgroundApiWorkService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4571
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceExecutorProvider:Ljavax/inject/Provider;

    .line 4572
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkExecutor;

    .line 4571
    invoke-static {p1, v0}, Lcom/ibotta/android/service/api/InBackgroundApiWorkService_MembersInjector;->injectApiWorkExecutor(Lcom/ibotta/android/service/api/InBackgroundApiWorkService;Lcom/ibotta/android/service/api/ApiWorkExecutor;)V

    return-object p1
.end method

.method private injectInForegroundApiWorkService(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)Lcom/ibotta/android/service/api/InForegroundApiWorkService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4563
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceExecutorProvider:Ljavax/inject/Provider;

    .line 4564
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkExecutor;

    .line 4563
    invoke-static {p1, v0}, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;->injectApiWorkExecutor(Lcom/ibotta/android/service/api/InForegroundApiWorkService;Lcom/ibotta/android/service/api/ApiWorkExecutor;)V

    return-object p1
.end method

.method private injectJoustCellEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5032
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5033
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5032
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectLoadRetailerCategoriesExperimentalVariant(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4888
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 4889
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v1

    .line 4888
    invoke-static {p1, v0, v1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->injectInit(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object p1
.end method

.method private injectLocateStoreEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4749
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4750
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4749
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 4751
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 4752
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 4751
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;Lcom/ibotta/android/state/user/UserState;)V

    return-object p1
.end method

.method private injectLocationChangeReceiver(Lcom/ibotta/android/receiver/LocationChangeReceiver;)Lcom/ibotta/android/receiver/LocationChangeReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4449
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 4450
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/LocationStatusDispatcher;

    .line 4449
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;->injectLocationStatusDispatcher(Lcom/ibotta/android/receiver/LocationChangeReceiver;Lcom/ibotta/android/location/LocationStatusDispatcher;)V

    return-object p1
.end method

.method private injectLocationProviderChangedReceiver(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;)Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4457
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationStatusDispatcherProvider:Ljavax/inject/Provider;

    .line 4458
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/LocationStatusDispatcher;

    .line 4457
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/LocationProviderChangedReceiver_MembersInjector;->injectLocationStatusDispatcher(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;Lcom/ibotta/android/location/LocationStatusDispatcher;)V

    .line 4459
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 4460
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 4459
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/LocationProviderChangedReceiver_MembersInjector;->injectTracker(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method

.method private injectLocationUpdateService(Lcom/ibotta/android/service/location/LocationUpdateService;)Lcom/ibotta/android/service/location/LocationUpdateService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4502
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectAppHelper(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/util/AppHelper;)V

    .line 4503
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsStateProvider:Ljavax/inject/Provider;

    .line 4504
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/permissions/PermissionsState;

    .line 4503
    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectPermissionsState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/app/permissions/PermissionsState;)V

    .line 4505
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectUserState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/user/UserState;)V

    return-object p1
.end method

.method private injectMonolithLoadRetailersVariant(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4690
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;->injectInit(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object p1
.end method

.method private injectMoreStoresRetailerRowView(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5065
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5066
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5065
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectMyEarningsHistoryView(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;)Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4848
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method

.method private injectMyEarningsTeammatesView(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4854
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method

.method private injectMyOffersGalleryListView(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4334
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    .line 4333
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 4335
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4336
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4335
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method

.method private injectMyRetailersTracking(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;)Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4342
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4343
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4342
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 4347
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideMyRebatesEventContextProviderFactory;->proxyProvideMyRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    .line 4344
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking_MembersInjector;->injectMyRebatesEventContextProvider(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object p1
.end method

.method private injectNavButtonView(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4866
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4867
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectNetworkChangeReceiver(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)Lcom/ibotta/android/receiver/NetworkChangeReceiver;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4494
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4495
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4494
    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 4496
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->injectHardware(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/hardware/Hardware;)V

    return-object p1
.end method

.method private injectNewRelicTimingAspect(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4601
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4602
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getNewRelicTimingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->injectFactory(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;)V

    return-object p1
.end method

.method private injectNewRelicTrackingAspect(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4591
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4595
    invoke-static {}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->proxyProvideNewRelicTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    move-result-object v0

    .line 4592
    invoke-static {p1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect_MembersInjector;->injectFactory(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;)V

    return-object p1
.end method

.method private injectNotificationRowView(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4997
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 4998
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectOfferImageView(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4410
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4411
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object p1
.end method

.method private injectOfferSummaryView(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4417
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4418
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4419
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 4420
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/Formatting;)V

    .line 4421
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferButtonReducer()Lcom/ibotta/android/button/OfferButtonReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/button/OfferButtonReducer;)V

    return-object p1
.end method

.method private injectPasswordCacheAspect(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)Lcom/ibotta/android/aop/password/PasswordCacheAspect;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4615
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4616
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePasswordCacheProvider:Ljavax/inject/Provider;

    .line 4617
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/PasswordCache;

    .line 4616
    invoke-static {p1, v0}, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->injectPasswordCache(Lcom/ibotta/android/aop/password/PasswordCacheAspect;Lcom/ibotta/android/security/PasswordCache;)V

    return-object p1
.end method

.method private injectPendingEarningsProgressView(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;)Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4935
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4936
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4935
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;Lcom/ibotta/android/util/Formatting;)V

    .line 4937
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;Landroid/os/Handler;)V

    return-object p1
.end method

.method private injectPendingReceiptsView(Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;)Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4964
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectPersonalStoreCardView(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5045
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5046
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5045
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectPersonalStoresListView(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4230
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4231
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method

.method private injectPixelTrackingService(Lcom/ibotta/android/service/pixel/PixelTrackingService;)Lcom/ibotta/android/service/pixel/PixelTrackingService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4578
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4579
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4578
    invoke-static {p1, v0}, Lcom/ibotta/android/service/pixel/PixelTrackingService_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/service/pixel/PixelTrackingService;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    return-object p1
.end method

.method private injectProductRowView(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5052
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectProductSpotlightTopContentView(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4638
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4639
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4640
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4639
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4641
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4642
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4641
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectProfileImageView(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;)Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4880
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;Lcom/ibotta/android/state/user/UserState;)V

    .line 4881
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectProgressCircleView(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4970
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/common/ProgressCircleView;Lcom/ibotta/android/util/Formatting;)V

    .line 4971
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/common/ProgressCircleView;Landroid/os/Handler;)V

    return-object p1
.end method

.method private injectPromptDialogFragment(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4237
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment_MembersInjector;->injectTitleBarReducer(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object p1
.end method

.method private injectPwiProductionVariantV1(Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;)Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4697
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiPlayhouseVariant()Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    move-result-object v0

    .line 4696
    invoke-static {p1, v0}, Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1_MembersInjector;->injectPwiPlayhouseVariant(Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;)V

    return-object p1
.end method

.method private injectPwiTestingVariantV1(Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;)Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4704
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiPlayhouseVariant()Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    move-result-object v0

    .line 4703
    invoke-static {p1, v0}, Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1_MembersInjector;->injectPwiPlayhouseVariant(Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;)V

    return-object p1
.end method

.method private injectQuestView(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)Lcom/ibotta/android/mvp/ui/view/quests/QuestView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4921
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;Lcom/ibotta/android/util/Formatting;)V

    .line 4922
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectQuestionEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4720
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4721
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4720
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 4722
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOptionHelperProvider:Ljavax/inject/Provider;

    .line 4723
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OptionHelper;

    .line 4722
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->injectOptionHelper(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/api/helper/offer/OptionHelper;)V

    .line 4724
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGameQuestionDriverFactoryProvider:Ljavax/inject/Provider;

    .line 4725
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;

    .line 4724
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->injectGameQuestionDriverFactory(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;)V

    return-object p1
.end method

.method private injectRebateCardRowView(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4353
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView_MembersInjector;->injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 4354
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 4355
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 4354
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4356
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 4357
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4358
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectRebateRowView(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4392
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4393
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4394
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 4395
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4396
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 4397
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferButtonReducer()Lcom/ibotta/android/button/OfferButtonReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/button/OfferButtonReducer;)V

    return-object p1
.end method

.method private injectReceiptCameraView(Lcom/ibotta/android/view/camera/ReceiptCameraView;)Lcom/ibotta/android/view/camera/ReceiptCameraView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4710
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/view/camera/CameraView;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4711
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/Handler;)V

    .line 4712
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4713
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4714
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/hardware/Hardware;)V

    return-object p1
.end method

.method private injectReceiptScanFooterView(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5078
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5079
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5078
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectRedeemInstructionsView(Lcom/ibotta/android/view/redeem/RedeemInstructionsView;)Lcom/ibotta/android/view/redeem/RedeemInstructionsView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4907
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4908
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4907
    invoke-static {p1, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/redeem/RedeemInstructionsView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectRelatedOffersList(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;)Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4371
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_MembersInjector;->injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 4372
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    .line 4373
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 4372
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4374
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 4375
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Lcom/ibotta/android/util/AppHelper;)V

    .line 4376
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object p1
.end method

.method private injectRetailerCardView(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5058
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectRetailerLocationsMapView(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)Lcom/ibotta/android/view/map/RetailerLocationsMapView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4785
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 4786
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 4785
    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectUserState(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/state/user/UserState;)V

    .line 4787
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 4788
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;

    .line 4789
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    .line 4788
    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectPermissionsHelperFactory(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V

    return-object p1
.end method

.method private injectRetailerPickerDialog(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;)Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5091
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 5092
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 5091
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectRetailerRowView(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5072
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectRetailerSpreadView(Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;)Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5098
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectRoutingActivity(Lcom/ibotta/android/activity/routing/RoutingActivity;)Lcom/ibotta/android/activity/routing/RoutingActivity;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4518
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRouteCleaner(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/cleaner/RouteCleaner;)V

    .line 4520
    invoke-static {}, Lcom/ibotta/android/di/RoutingModule_ProvideUrlResolverFactory;->proxyProvideUrlResolver()Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    .line 4519
    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectUrlResolver(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/urlresolver/UrlResolver;)V

    .line 4521
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 4522
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 4521
    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectLifecycleTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V

    .line 4523
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRoutePreviewer()Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRoutePreviewer(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V

    .line 4524
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAppCache(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/appcache/AppCache;)V

    .line 4525
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 4526
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 4527
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 4528
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    .line 4529
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 4528
    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 4530
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRoutingUriProcessor()Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRoutingUriProcessor(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;)V

    return-object p1
.end method

.method private injectScanProductView(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;)Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 5085
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectScheduledWorkService(Lcom/ibotta/android/service/work/ScheduledWorkService;)Lcom/ibotta/android/service/work/ScheduledWorkService;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4511
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScheduledWorkersProvider:Ljavax/inject/Provider;

    .line 4512
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 4511
    invoke-static {p1, v0}, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;->injectScheduledWorkers(Lcom/ibotta/android/service/work/ScheduledWorkService;Ljava/util/Set;)V

    return-object p1
.end method

.method private injectShowAlsoViewedVariant(Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;)Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4648
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 4649
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 4648
    invoke-static {p1, v0}, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant_MembersInjector;->injectGraphQLCallFactory(Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object p1
.end method

.method private injectSimpleEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4739
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4740
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4739
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 4741
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4742
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4741
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectSpotlightAvailableAtView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4804
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method

.method private injectSpotlightBlurbView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4243
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView_MembersInjector;->injectTitleBarReducer(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object p1
.end method

.method private injectSpotlightDetailsView(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4765
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4766
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4767
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 4766
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectSpotlightLocateStoreView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4797
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    .line 4796
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;->injectApiWorkSubmitter(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-object p1
.end method

.method private injectStandardReceiptGuideView(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;)Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4874
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;Lcom/ibotta/android/hardware/Hardware;)V

    return-object p1
.end method

.method private injectTeammateDetailView(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4984
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectTeammateRowView(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4990
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 4991
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectTestifyEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4758
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4759
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4758
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    return-object p1
.end method

.method private injectTrackingAspect(Lcom/ibotta/android/aop/tracking/TrackingAspect;)Lcom/ibotta/android/aop/tracking/TrackingAspect;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4608
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 4609
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect_MembersInjector;->injectFactory(Lcom/ibotta/android/aop/tracking/TrackingAspect;Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;)V

    return-object p1
.end method

.method private injectTxLedgerView(Lcom/ibotta/android/view/earnings/TxLedgerView;)Lcom/ibotta/android/view/earnings/TxLedgerView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4914
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView_MembersInjector;->injectImageCache(Lcom/ibotta/android/view/earnings/TxLedgerView;Lcom/ibotta/android/images/ImageCache;)V

    .line 4915
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/earnings/TxLedgerView;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method

.method private injectVerifiableRebateRowView(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4439
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 4440
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 4439
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 4441
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 4442
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4443
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4442
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectVideoEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4731
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 4732
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 4731
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 4733
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectWelcomeBackDefaultView(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;)Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4316
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkStorageProvider:Ljavax/inject/Provider;

    .line 4317
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 4316
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_MembersInjector;->injectStorage(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V

    .line 4318
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4319
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4318
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method

.method private injectWelcomeBackSuccessView(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 4307
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkStorageProvider:Ljavax/inject/Provider;

    .line 4308
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 4307
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->injectStorage(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V

    .line 4309
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    .line 4310
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 4309
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method


# virtual methods
.method public getAccountEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4004
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideAccountEventContextProviderFactory;->proxyProvideAccountEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getActivityLifecycleListener()Lcom/ibotta/android/ActivityLifecycleListener;
    .locals 1

    .line 3942
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideActivityLifecycleListenerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/ActivityLifecycleListener;

    return-object v0
.end method

.method public getAddFavoritesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4010
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideAddFavoritesEventContextProviderFactory;->proxyProvideAddFavoritesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getAlsoBoughtViewedVariant()Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;
    .locals 1

    .line 3683
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3684
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3683
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideAlsoBoughtViewedVariantFactory;->proxyProvideAlsoBoughtViewedVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    move-result-object v0

    return-object v0
.end method

.method public getAmountBadgeVariant()Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;
    .locals 1

    .line 3969
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3970
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3969
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideToolbarAmountVariantFactory;->proxyProvideToolbarAmountVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    move-result-object v0

    return-object v0
.end method

.method public getApiCallFactory()Lcom/ibotta/api/call/ApiCallFactory;
    .locals 1

    .line 3714
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiCallFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/ApiCallFactory;

    return-object v0
.end method

.method public getApiClient()Lcom/ibotta/api/ApiClient;
    .locals 1

    .line 3709
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiClientProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/ApiClient;

    return-object v0
.end method

.method public getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;
    .locals 1

    .line 3719
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiExecutionFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/execution/ApiExecutionFactory;

    return-object v0
.end method

.method public getApiJobEnvironment()Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
    .locals 1

    .line 3964
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiJobEnvironmentProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    return-object v0
.end method

.method public getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;
    .locals 1

    .line 3724
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiCallFactoryProvider:Ljavax/inject/Provider;

    .line 3725
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/ApiCallFactory;

    .line 3724
    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiJobFactoryFactory;->proxyProvideApiJobFactory(Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v0

    return-object v0
.end method

.method public getApiOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1

    .line 3542
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiOkHttpClientProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .locals 9

    .line 3427
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 3428
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    .line 3429
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceLockProvider:Ljavax/inject/Provider;

    .line 3430
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/locks/Lock;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkServiceProdConLockProvider:Ljavax/inject/Provider;

    .line 3431
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/locks/Lock;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProdConProduceConditionProvider:Ljavax/inject/Provider;

    .line 3432
    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/locks/Condition;

    iget-object v6, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAsyncGroupManagerProvider:Ljavax/inject/Provider;

    .line 3433
    invoke-interface {v6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/AsyncGroupManager;

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApiWorkExecutorServiceProvider:Ljavax/inject/Provider;

    .line 3434
    invoke-interface {v7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ExecutorService;

    iget-object v8, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideExecServiceManagerProvider:Ljavax/inject/Provider;

    .line 3435
    invoke-interface {v8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 3426
    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->proxyProvideApiWorkSubmitter(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    return-object v0
.end method

.method public getApolloClient()Lcom/apollographql/apollo/ApolloClient;
    .locals 1

    .line 3502
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideApolloClientProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/apollographql/apollo/ApolloClient;

    return-object v0
.end method

.method public getAppCache()Lcom/ibotta/android/appcache/AppCache;
    .locals 1

    .line 3294
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    return-object v0
.end method

.method public getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;
    .locals 1

    .line 3389
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    return-object v0
.end method

.method public getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1

    .line 3394
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    return-object v0
.end method

.method public getAppHelper()Lcom/ibotta/android/util/AppHelper;
    .locals 4

    .line 3460
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    .line 3461
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getExpirationRulesSupplier()Lcom/ibotta/android/util/ExpirationRulesSupplier;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v3

    .line 3460
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->proxyProvideAppHelper(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    return-object v0
.end method

.method public getAppTimingTracker()Lcom/ibotta/android/tracking/timing/AppTimingTracker;
    .locals 1

    .line 3289
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppTimingTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    return-object v0
.end method

.method public getAppUpgrader()Lcom/ibotta/android/state/app/upgrade/AppUpgrader;
    .locals 1

    .line 3399
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppUpgraderProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    return-object v0
.end method

.method public getAppboy()Lcom/appboy/Appboy;
    .locals 1

    .line 3663
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContextProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideAppboyFactory;->proxyProvideAppboy(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    return-object v0
.end method

.method public getAppsFlyerState()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;
    .locals 1

    .line 3632
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppsFlyerStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    return-object v0
.end method

.method public getAppsFlyerUID()Ljava/lang/String;
    .locals 1

    .line 3870
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->getAppsFlyerUIDProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAsyncRecentSearchService()Lcom/ibotta/android/search/AsyncRecentSearchService;
    .locals 1

    .line 3649
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRecentSearchService()Lcom/ibotta/android/search/RecentSearchService;

    move-result-object v0

    .line 3648
    invoke-static {v0}, Lcom/ibotta/android/di/SearchModule_ProvideAsyncRecentSearchServiceFactory;->proxyProvideAsyncRecentSearchService(Lcom/ibotta/android/search/RecentSearchService;)Lcom/ibotta/android/search/AsyncRecentSearchService;

    move-result-object v0

    return-object v0
.end method

.method public getAsyncUnifiedSearchService()Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 3

    .line 3656
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getNamedAsyncSuggestedSearchService()Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    .line 3657
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getNamedAsyncSuggestedSearchService2()Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v1

    .line 3658
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v2

    .line 3655
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/SearchModule_ProvideUnifiedAsyncSuggestedSearchServiceFactory;->proxyProvideUnifiedAsyncSuggestedSearchService(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method public getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;
    .locals 1

    .line 3736
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    return-object v0
.end method

.method public getBannerReducer()Lcom/ibotta/android/featured/BannerReducer;
    .locals 1

    .line 4192
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBannerReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/featured/BannerReducer;

    return-object v0
.end method

.method public getBitmapUtil()Lcom/ibotta/android/util/BitmapUtil;
    .locals 1

    .line 3841
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBitmapUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/BitmapUtil;

    return-object v0
.end method

.method public getBonusBucketedComparator()Lcom/ibotta/android/collection/BonusBucketedComparator;
    .locals 1

    .line 3998
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusBucketedComparatorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/collection/BonusBucketedComparator;

    return-object v0
.end method

.method public getBonusHelper()Lcom/ibotta/api/helper/bonus/BonusHelper;
    .locals 1

    .line 3224
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-object v0
.end method

.method public getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .locals 1

    .line 3284
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-object v0
.end method

.method public getBrazeTrackingUtil()Lcom/ibotta/android/braze/BrazeTrackingDataFactory;
    .locals 1

    .line 4210
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBrazeTrackingUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    return-object v0
.end method

.method public getBreadcrumbStorage()Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;
    .locals 1

    .line 3590
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBreadcrumbStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    return-object v0
.end method

.method public getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;
    .locals 1

    .line 3595
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideBuildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    return-object v0
.end method

.method public getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
    .locals 1

    .line 3344
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideButtonSdkManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    return-object v0
.end method

.method public getBuyableGIftCardImageReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
    .locals 1

    .line 4125
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardImageReducerFactory;->proxyProvideBuyableGiftCardImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object v0

    return-object v0
.end method

.method public getBuyableGiftCardCardReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
    .locals 4

    .line 4116
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBuyableGIftCardImageReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    move-result-object v0

    .line 4117
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBuyableGiftCardSummaryReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object v1

    .line 4118
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPayAtRetailerButtonReducer()Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentBackgroundReducerProvider:Ljavax/inject/Provider;

    .line 4119
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/content/ContentBackgroundReducer;

    .line 4115
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardCardReducerFactory;->proxyProvideBuyableGiftCardCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public getBuyableGiftCardSummaryReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
    .locals 2

    .line 4130
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 4131
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideBuyableGiftCardSummaryReducerFactory;->proxyProvideBuyableGiftCardSummaryReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public getCacheClearHelper()Lcom/ibotta/android/appcache/CacheClearHelper;
    .locals 1

    .line 3895
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheClearHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/CacheClearHelper;

    return-object v0
.end method

.method public getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 5

    .line 3900
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 3901
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    .line 3902
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/appcache/AppCache;

    .line 3903
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getIbottaApolloCache()Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    .line 3904
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 3905
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v4

    .line 3900
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearJobFactoryFactory;->proxyProvideCacheClearJobFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    return-object v0
.end method

.method public getCacheKeyMatcherFactory()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;
    .locals 1

    .line 3537
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    return-object v0
.end method

.method public getCachePolicies()Lcom/ibotta/android/appcache/policy/CachePolicies;
    .locals 1

    .line 3304
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCachePoliciesProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/policy/CachePolicies;

    return-object v0
.end method

.method public getCategoryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4016
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideCategoryEventContextProviderFactory;->proxyProvideCategoryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryHelper()Lcom/ibotta/api/helper/retailer/CategoryHelper;
    .locals 1

    .line 3249
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCategoryHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/retailer/CategoryHelper;

    return-object v0
.end method

.method public getClearableCookieJar()Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;
    .locals 1

    .line 3704
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideClearableCookieJarProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;

    return-object v0
.end method

.method public getConfigRegistry()Lcom/ibotta/android/features/registry/ConfigRegistry;
    .locals 1

    .line 3571
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTestConfigRegistryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/registry/ConfigRegistry;

    return-object v0
.end method

.method public getContentBackgroundReducer()Lcom/ibotta/android/content/ContentBackgroundReducer;
    .locals 1

    .line 4175
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentBackgroundReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/content/ContentBackgroundReducer;

    return-object v0
.end method

.method public getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;
    .locals 3

    .line 4187
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBuyableGiftCardCardReducer()Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getDealCardReducer()Lcom/ibotta/android/content/card/deal/DealCardReducer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferCardReducer()Lcom/ibotta/android/content/card/offer/OfferCardReducer;

    move-result-object v2

    .line 4186
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ReducerModule_ProvideContentCardReducerFactory;->proxyProvideContentCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;Lcom/ibotta/android/content/card/deal/DealCardReducer;Lcom/ibotta/android/content/card/offer/OfferCardReducer;)Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public getContentHelper()Lcom/ibotta/android/util/content/ContentHelper;
    .locals 1

    .line 3746
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/content/ContentHelper;

    return-object v0
.end method

.method public getContentListReducer()Lcom/ibotta/android/content/ContentListReducer;
    .locals 4

    .line 3886
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 3887
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 3888
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v1

    .line 3889
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 3890
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v3

    .line 3886
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/PwiModule_ProvideContentListReducerFactory;->proxyProvideContentListReducer(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Landroid/content/res/Resources;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/content/ContentListReducer;

    move-result-object v0

    return-object v0
.end method

.method public getContentListReducerUtil()Lcom/ibotta/android/content/ContentListReducerUtil;
    .locals 3

    .line 4198
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentRowReducer()Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    .line 4199
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentCardReducer()Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v1

    .line 4200
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideContentTrackingReducerFactory;->proxyProvideContentTrackingReducer()Lcom/ibotta/android/content/tracking/ContentTrackingReducer;

    move-result-object v2

    .line 4197
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ReducerModule_ProvideContentListReducerUtilFactory;->proxyProvideContentListReducerUtil(Lcom/ibotta/android/content/row/ContentRowReducer;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/tracking/ContentTrackingReducer;)Lcom/ibotta/android/content/ContentListReducerUtil;

    move-result-object v0

    return-object v0
.end method

.method public getContentMapper()Lcom/ibotta/android/mappers/ContentMapper;
    .locals 1

    .line 3741
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentMapperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mappers/ContentMapper;

    return-object v0
.end method

.method public getContentRowReducer()Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 12

    .line 4081
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferButtonReducer()Lcom/ibotta/android/button/OfferButtonReducer;

    move-result-object v0

    .line 4082
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferSummaryReducer()Lcom/ibotta/android/offer/OfferSummaryReducer;

    move-result-object v1

    .line 4083
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferBadgeViewReducer()Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object v2

    .line 4084
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferExpiringBannerReducer()Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    move-result-object v3

    .line 4085
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideContentIdReducerFactory;->proxyProvideContentIdReducer()Lcom/ibotta/android/content/generic/ContentIdReducer;

    move-result-object v4

    .line 4086
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideContentImageReducerFactory;->proxyProvideContentImageReducer()Lcom/ibotta/android/content/ContentImageReducer;

    move-result-object v5

    .line 4087
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideFavoriteButtonReducerFactory;->proxyProvideFavoriteButtonReducer()Lcom/ibotta/android/button/FavoriteButtonReducer;

    move-result-object v6

    .line 4088
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerSummaryReducer()Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object v7

    .line 4089
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideProductImageReducerFactory;->proxyProvideProductImageReducer()Lcom/ibotta/android/content/card/product/ProductImageReducer;

    move-result-object v8

    .line 4090
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getProductSummaryReducer()Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object v9

    .line 4091
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getProductButtonReducer()Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object v10

    .line 4092
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerStackReducer()Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object v11

    .line 4080
    invoke-static/range {v0 .. v11}, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->proxyProvideContentRowReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    return-object v0
.end method

.method public getContentTrackingReducer()Lcom/ibotta/android/content/tracking/ContentTrackingReducer;
    .locals 1

    .line 4097
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideContentTrackingReducerFactory;->proxyProvideContentTrackingReducer()Lcom/ibotta/android/content/tracking/ContentTrackingReducer;

    move-result-object v0

    return-object v0
.end method

.method public getContentWithInfoRowReducer()Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
    .locals 2

    .line 4224
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getContentListReducerUtil()Lcom/ibotta/android/content/ContentListReducerUtil;

    move-result-object v0

    .line 4225
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v1

    .line 4223
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->proxyProvideContentWithInfoRowReducer(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    move-result-object v0

    return-object v0
.end method

.method public getCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 1

    .line 3259
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerSocialHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    return-object v0
.end method

.method public getDealButtonReducer()Lcom/ibotta/android/content/card/deal/DealButtonReducer;
    .locals 1

    .line 4161
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideShopButtonReducerFactory;->proxyProvideShopButtonReducer()Lcom/ibotta/android/button/ShopButtonReducer;

    move-result-object v0

    .line 4160
    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideDealButtonReducerFactory;->proxyProvideDealButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/deal/DealButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public getDealCardReducer()Lcom/ibotta/android/content/card/deal/DealCardReducer;
    .locals 4

    .line 4166
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealImageReducerProvider:Ljavax/inject/Provider;

    .line 4167
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/content/card/deal/DealImageReducer;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDealSummaryReducerProvider:Ljavax/inject/Provider;

    .line 4168
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;

    .line 4169
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getDealButtonReducer()Lcom/ibotta/android/content/card/deal/DealButtonReducer;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentBackgroundReducerProvider:Ljavax/inject/Provider;

    .line 4170
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/content/ContentBackgroundReducer;

    .line 4166
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ReducerModule_ProvideDealCardReducerFactory;->proxyProvideDealCardReducer(Lcom/ibotta/android/content/card/deal/DealImageReducer;Lcom/ibotta/android/content/card/deal/DealSummaryReducer;Lcom/ibotta/android/content/card/deal/DealButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/deal/DealCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public getDebugFeatureFlagReducer()Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;
    .locals 1

    .line 4155
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    return-object v0
.end method

.method public getDebugFeatureFlagStorage()Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
    .locals 1

    .line 3576
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugFeatureFlagStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    return-object v0
.end method

.method public getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;
    .locals 1

    .line 3605
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDebugStateSharedPrefsProvider:Ljavax/inject/Provider;

    .line 3606
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    .line 3605
    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateFactory;->proxyProvideDebugState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceRegistrationAsync()Lcom/ibotta/android/async/device/DeviceRegistrationAsync;
    .locals 1

    .line 3404
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceRegistrationAsyncProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/async/device/DeviceRegistrationAsync;

    return-object v0
.end method

.method public getDeviceSecurity()Lcom/ibotta/android/security/DeviceSecurity;
    .locals 1

    .line 3637
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideDeviceSecurityProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/DeviceSecurity;

    return-object v0
.end method

.method public getEarningsHelper()Lcom/ibotta/api/helper/earnings/EarningsHelper;
    .locals 1

    .line 3254
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEarningsHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/earnings/EarningsHelper;

    return-object v0
.end method

.method public getEmailState()Lcom/ibotta/android/state/app/email/EmailState;
    .locals 1

    .line 3379
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideEmailStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/email/EmailState;

    return-object v0
.end method

.method public getExpirationRulesSupplier()Lcom/ibotta/android/util/ExpirationRulesSupplier;
    .locals 1

    .line 3751
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 3752
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {v0}, Lcom/ibotta/android/di/MiscModule_ProvideExpirationDateFormatSupplierFactory;->proxyProvideExpirationDateFormatSupplier(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/util/ExpirationRulesSupplier;

    move-result-object v0

    return-object v0
.end method

.method public getFavoriteRetailerSettingsFlushWorker()Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 1

    .line 3611
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    return-object v0
.end method

.method public getFavoriteRetailersManagerFactory()Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
    .locals 1

    .line 3616
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFavoriteRetailerManagerFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    return-object v0
.end method

.method public getFcmState()Lcom/ibotta/android/state/app/fcm/FcmState;
    .locals 1

    .line 3359
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFcmStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/fcm/FcmState;

    return-object v0
.end method

.method public getFeatureFlagResponseUtil()Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 1

    .line 3762
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFlagResponseUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-object v0
.end method

.method public getFeaturedEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4022
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideFeaturedEventContextProviderFactory;->proxyProvideFeaturedEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getFileProviderHelper()Lcom/ibotta/android/share/FileProviderHelper;
    .locals 1

    .line 3440
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFileProviderHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/share/FileProviderHelper;

    return-object v0
.end method

.method public getFindRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4028
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideFindRebatesEventContextProviderFactory;->proxyProvideFindRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getFormatting()Lcom/ibotta/android/util/Formatting;
    .locals 1

    .line 3334
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    return-object v0
.end method

.method public getGalleryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4034
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideGalleryEventContextProviderFactory;->proxyProvideGalleryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getGalleryHeaderReducer()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .locals 7

    .line 3668
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 3669
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 3670
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImUtilProvider:Ljavax/inject/Provider;

    .line 3671
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 3672
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v4

    .line 3673
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getLoyaltyLinkVariant()Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;)V

    return-object v6
.end method

.method public getGalleryOrganizer()Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;
    .locals 3

    .line 3467
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAllGalleryCategoryVariant()Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v2

    .line 3466
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/MiscModule_ProvideGalleryOrganizerFactory;->proxyProvideGalleryOrganizer(Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    move-result-object v0

    return-object v0
.end method

.method public getGeofenceCoordinator()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .locals 1

    .line 3314
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGeofenceCoordinatorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    return-object v0
.end method

.method public getGiftCardHelper()Lcom/ibotta/api/helper/card/GiftCardHelper;
    .locals 1

    .line 3229
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGiftCardHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/card/GiftCardHelper;

    return-object v0
.end method

.method public getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;
    .locals 1

    .line 3349
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGlobalEventManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    return-object v0
.end method

.method public getGooglePayManager()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;
    .locals 2

    .line 3830
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    .line 3831
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v1

    .line 3830
    invoke-static {v0, v1}, Lcom/ibotta/android/di/PwiModule_ProvideGooglePayManagerFactory;->proxyProvideGooglePayManager(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    move-result-object v0

    return-object v0
.end method

.method public getGoogleState()Lcom/ibotta/android/state/app/google/GoogleState;
    .locals 1

    .line 3374
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGoogleStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/google/GoogleState;

    return-object v0
.end method

.method public getGraphQLCallFactory()Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .locals 1

    .line 3532
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-object v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    .line 3445
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideHandlerFactory;->proxyProvideHandler(Lcom/ibotta/android/App;)Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method public getHardware()Lcom/ibotta/android/hardware/Hardware;
    .locals 1

    .line 3455
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    invoke-static {v0}, Lcom/ibotta/android/di/HardwareModule_ProvideHardwareFactory;->proxyProvideHardware(Lcom/ibotta/android/App;)Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    return-object v0
.end method

.method public getIbottaApolloCache()Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 1

    .line 3526
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNormalizedCacheFactoryProvider:Ljavax/inject/Provider;

    .line 3527
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;

    .line 3526
    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideNormalizedCacheFactory;->proxyProvideNormalizedCache(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    return-object v0
.end method

.method public getIbottaListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .locals 1

    .line 3852
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v0

    return-object v0
.end method

.method public getIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;
    .locals 1

    .line 3778
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideIbottaListViewTrackingHelperFactory;->proxyProvideIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    move-result-object v0

    return-object v0
.end method

.method public getImTextHelper()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .locals 1

    .line 3678
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    return-object v0
.end method

.method public getImageCache()Lcom/ibotta/android/images/ImageCache;
    .locals 1

    .line 3600
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideImageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    return-object v0
.end method

.method public getLifecycleTracker()Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .locals 1

    .line 3472
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    return-object v0
.end method

.method public getLoadRetailerCategoriesVariant()Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;
    .locals 1

    .line 4102
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 4103
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 4102
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailerCategoriesFactory;->proxyProvideLoadRetailerCategories(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    move-result-object v0

    return-object v0
.end method

.method public getLoadRetailersVariant()Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;
    .locals 1

    .line 3626
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3627
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3626
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideLoadRetailersVariantFactory;->proxyProvideLoadRetailersVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-result-object v0

    return-object v0
.end method

.method public getLocationUpdateManager()Lcom/ibotta/android/service/location/LocationUpdateManager;
    .locals 1

    .line 4075
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLocationUpdateManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/location/LocationUpdateManager;

    return-object v0
.end method

.method public getLogOutManager()Lcom/ibotta/android/state/user/LogOutManager;
    .locals 1

    .line 3274
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLogOutManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/LogOutManager;

    return-object v0
.end method

.method public getLoyaltyLinkVariant()Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;
    .locals 1

    .line 4051
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 4052
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 4051
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideLoyaltyLinkVariantFactory;->proxyProvideLoyaltyLinkVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    move-result-object v0

    return-object v0
.end method

.method public getMCommEscortStrategyFactory()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
    .locals 8

    .line 3547
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 3550
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 3551
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 3552
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 3553
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 3554
    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 3555
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getLoadRetailersVariant()Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-result-object v6

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 3556
    invoke-interface {v7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 3548
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->proxyProvideMCommEscortStrategyFactory(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-result-object v0

    return-object v0
.end method

.method public getMappers()Lcom/ibotta/android/graphql/mapper/Mappers;
    .locals 14

    .line 3508
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    .line 3509
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v1

    .line 3510
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object v2

    .line 3511
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v3

    .line 3512
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferCategoryWithReferencesMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object v4

    .line 3513
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getFeatureMapper()Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    move-result-object v5

    .line 3514
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object v6

    .line 3515
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getProductMapper()Lcom/ibotta/android/graphql/mapper/ProductMapper;

    move-result-object v7

    .line 3516
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object v8

    .line 3517
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getBuyableGiftCardRetailerMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    move-result-object v9

    .line 3518
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getDealMapper()Lcom/ibotta/android/graphql/mapper/DealMapper;

    move-result-object v10

    .line 3519
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getEngagementMapper()Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object v11

    iget-object v12, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideCustomerNodeMapperProvider:Ljavax/inject/Provider;

    .line 3520
    invoke-interface {v12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    iget-object v13, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoryNodeMapperProvider:Ljavax/inject/Provider;

    .line 3521
    invoke-interface {v13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    .line 3507
    invoke-static/range {v0 .. v13}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->proxyProvideMappers(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)Lcom/ibotta/android/graphql/mapper/Mappers;

    move-result-object v0

    return-object v0
.end method

.method public getMisspellingReducer()Lcom/ibotta/android/search/MisspellingReducer;
    .locals 1

    .line 3772
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMisspellingReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/search/MisspellingReducer;

    return-object v0
.end method

.method public getMvpPresenterActions()Lcom/ibotta/android/mvp/base/MvpPresenterActions;
    .locals 5

    .line 3790
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    .line 3791
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAggregateCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 3792
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/api/critical/CriticalDependency;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 3793
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 3794
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v4

    .line 3789
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/MiscModule_ProvideMvpPresenterActionsFactory;->proxyProvideMvpPresenterActions(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object v0

    return-object v0
.end method

.method public getMyRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4040
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideMyRebatesEventContextProviderFactory;->proxyProvideMyRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getNotificationDetailFactory()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;
    .locals 1

    .line 3947
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationDetailFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    return-object v0
.end method

.method public getNotificationRoutingUtil()Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;
    .locals 1

    .line 3767
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideNotificationRoutingUtilProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    return-object v0
.end method

.method public getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;
    .locals 3

    .line 3689
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method

.method public getOfferBadgeViewReducer()Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
    .locals 2

    .line 3958
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppConfigProvider:Ljavax/inject/Provider;

    .line 3959
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3958
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->proxyProvideOfferBadgeViewReducer(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object v0

    return-object v0
.end method

.method public getOfferButtonReducer()Lcom/ibotta/android/button/OfferButtonReducer;
    .locals 3

    .line 3930
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideShopButtonReducerFactory;->proxyProvideShopButtonReducer()Lcom/ibotta/android/button/ShopButtonReducer;

    move-result-object v0

    .line 3931
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideUnlockButtonReducerFactory;->proxyProvideUnlockButtonReducer()Lcom/ibotta/android/button/UnlockButtonReducer;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 3932
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 3929
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferButtonReducerFactory;->proxyProvideOfferButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;Lcom/ibotta/android/button/UnlockButtonReducer;Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/button/OfferButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public getOfferCardReducer()Lcom/ibotta/android/content/card/offer/OfferCardReducer;
    .locals 8

    .line 4143
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferButtonReducer()Lcom/ibotta/android/button/OfferButtonReducer;

    move-result-object v0

    .line 4144
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferBadgeViewReducer()Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object v1

    .line 4145
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferExpiringBannerReducer()Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    move-result-object v2

    .line 4146
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferSummaryReducer()Lcom/ibotta/android/offer/OfferSummaryReducer;

    move-result-object v3

    .line 4147
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getOfferImageReducer()Lcom/ibotta/android/content/card/offer/OfferImageReducer;

    move-result-object v4

    .line 4148
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideContentCardLayoutReducerFactory;->proxyProvideContentCardLayoutReducer()Lcom/ibotta/android/content/ContentCardLayoutReducer;

    move-result-object v5

    .line 4149
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerStackReducer()Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object v6

    iget-object v7, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideContentBackgroundReducerProvider:Ljavax/inject/Provider;

    .line 4150
    invoke-interface {v7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/content/ContentBackgroundReducer;

    .line 4142
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferCardReducerFactory;->proxyProvideOfferCardReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/content/card/offer/OfferImageReducer;Lcom/ibotta/android/content/ContentCardLayoutReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/offer/OfferCardReducer;

    move-result-object v0

    return-object v0
.end method

.method public getOfferCategoryHelper()Lcom/ibotta/api/helper/offer/OfferCategoryHelper;
    .locals 1

    .line 3239
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferCategoryHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferCategoryHelper;

    return-object v0
.end method

.method public getOfferExpiringBannerReducer()Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;
    .locals 2

    .line 3953
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferExpiringBannerReducerFactory;->proxyProvideOfferExpiringBannerReducer(Lcom/ibotta/android/util/AppHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    move-result-object v0

    return-object v0
.end method

.method public getOfferHelper()Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 1

    .line 3214
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    return-object v0
.end method

.method public getOfferImageReducer()Lcom/ibotta/android/content/card/offer/OfferImageReducer;
    .locals 3

    .line 4137
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 4136
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferImageReducerFactory;->proxyProvideOfferImageReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/offer/OfferImageReducer;

    move-result-object v0

    return-object v0
.end method

.method public getOfferSummaryReducer()Lcom/ibotta/android/offer/OfferSummaryReducer;
    .locals 2

    .line 3975
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 3976
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3975
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferSummaryReducerFactory;->proxyProvideOfferSummaryReducer(Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/OfferSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public getPartnerAppChecker()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;
    .locals 1

    .line 3566
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePartnerAppCheckerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    return-object v0
.end method

.method public getPasswordCache()Lcom/ibotta/android/security/PasswordCache;
    .locals 1

    .line 3299
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePasswordCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/PasswordCache;

    return-object v0
.end method

.method public getPayAtRetailerButtonReducer()Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;
    .locals 1

    .line 4070
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvidePayAtRetailerButtonReducerFactory;->proxyProvidePayAtRetailerButtonReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionPrimersVariant()Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;
    .locals 1

    .line 3642
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3643
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvidePermissionPrimersVariantFactory;->proxyProvidePermissionPrimersVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionsHelperFactory()Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .locals 1

    .line 3937
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsHelperFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    return-object v0
.end method

.method public getPermissionsState()Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 1

    .line 3369
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePermissionsStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/permissions/PermissionsState;

    return-object v0
.end method

.method public getPipelineFactory()Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .locals 1

    .line 3836
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePipelineFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/pipeline/PipelineFactory;

    return-object v0
.end method

.method public getPixelTrackingManager()Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .locals 1

    .line 3324
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePixelTrackingManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    return-object v0
.end method

.method public getPostAuthWorkJobFactory()Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;
    .locals 4

    .line 3581
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 3582
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAuthManagerProvider:Ljavax/inject/Provider;

    .line 3583
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/user/auth/AuthManager;

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 3584
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    iget-object v3, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideMvtCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 3585
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 3581
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/AppApiModule_ProvidePostAuthWorkJobFactoryFactory;->proxyProvidePostAuthWorkJobFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    move-result-object v0

    return-object v0
.end method

.method public getProductButtonReducer()Lcom/ibotta/android/content/card/product/ProductButtonReducer;
    .locals 1

    .line 4058
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideShopButtonReducerFactory;->proxyProvideShopButtonReducer()Lcom/ibotta/android/button/ShopButtonReducer;

    move-result-object v0

    .line 4057
    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideProductButtonReducerFactory;->proxyProvideProductButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public getProductGroupHelper()Lcom/ibotta/api/helper/offer/ProductGroupHelper;
    .locals 1

    .line 3234
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideProductGroupHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/ProductGroupHelper;

    return-object v0
.end method

.method public getProductSummaryReducer()Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
    .locals 2

    .line 4064
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    .line 4063
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideProductSummaryReducerFactory;->proxyProvideProductSummaryReducer(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public getPushMessaging()Lcom/ibotta/android/service/push/PushMessaging;
    .locals 1

    .line 3309
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePushMessagingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    return-object v0
.end method

.method public getPwiApiManager()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
    .locals 8

    .line 3813
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 3814
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 3815
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getStripeManager()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;

    move-result-object v2

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiRetailersHolderProvider:Ljavax/inject/Provider;

    .line 3816
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 3817
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v4

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 3818
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ibotta/android/util/Formatting;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 3819
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/ibotta/android/state/user/UserState;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    .line 3820
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/ibotta/android/appcache/AppCache;

    .line 3813
    invoke-static/range {v1 .. v7}, Lcom/ibotta/android/di/PwiModule_ProvidePwiApiManagerFactory;->proxyProvidePwiApiManager(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    move-result-object v0

    return-object v0
.end method

.method public getPwiBarcodeReducer()Lcom/ibotta/android/pwi/PwiBarcodeReducer;
    .locals 2

    .line 3880
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 3881
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3880
    invoke-static {v0, v1}, Lcom/ibotta/android/di/PwiModule_ProvidePwiBarcodeReducerFactory;->proxyProvidePwiBarcodeReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    move-result-object v0

    return-object v0
.end method

.method public getPwiHomeReducer()Lcom/ibotta/android/pwi/PwiHomeReducer;
    .locals 4

    .line 3800
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFormattingProvider:Ljavax/inject/Provider;

    .line 3801
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/Formatting;

    .line 3802
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 3803
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v3

    .line 3799
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->proxyProvidePwiHomeReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/pwi/PwiHomeReducer;

    move-result-object v0

    return-object v0
.end method

.method public getPwiPlayhouseVariant()Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;
    .locals 1

    .line 3783
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3784
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3783
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvidePwiPlayouseVariantFactory;->proxyProvidePwiPlayouseVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    move-result-object v0

    return-object v0
.end method

.method public getPwiUserState()Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 1

    .line 3825
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->providePwiUserStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/pwi/PwiUserState;

    return-object v0
.end method

.method public getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;
    .locals 1

    .line 3730
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3731
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3730
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideIgcVariantFactory;->proxyProvideIgcVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v0

    return-object v0
.end method

.method public getReceiptSubmissionHelper()Lcom/ibotta/android/submission/ReceiptSubmissionHelper;
    .locals 1

    .line 3497
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideReceiptSubmissionHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    return-object v0
.end method

.method public getRecentlyViewedOfferHelper()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .locals 1

    .line 3846
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideOfferHelperProvider:Ljavax/inject/Provider;

    .line 3847
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 3846
    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_RecentlyViewedOfferHelperFactory;->proxyRecentlyViewedOfferHelper(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object v0

    return-object v0
.end method

.method public getRecentlyViewedRetailersService()Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;
    .locals 3

    .line 4217
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getIbottaApolloCache()Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 4216
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/SearchModule_ProvideRecentlyViewedRetailersServiceFactory;->proxyProvideRecentlyViewedRetailersService(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    .line 3450
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->application:Lcom/ibotta/android/App;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideResourcesFactory;->proxyProvideResources(Lcom/ibotta/android/App;)Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerCategoriesReducer()Lcom/ibotta/android/categories/RetailerCategoriesReducer;
    .locals 1

    .line 4205
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerCategoriesReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/categories/RetailerCategoriesReducer;

    return-object v0
.end method

.method public getRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;
    .locals 1

    .line 3219
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-object v0
.end method

.method public getRetailerHorizListReducer()Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 2

    .line 3923
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerSSCardReducer()Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    move-result-object v0

    .line 3924
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v1

    .line 3922
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerHorizListReducerFactory;->proxyProvideRetailerHorizListReducer(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerIconOnOfferVariant()Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;
    .locals 1

    .line 4180
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 4181
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideRetailerIconOnOfferVariantFactory;->proxyProvideRetailerIconOnOfferVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;
    .locals 1

    .line 3981
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerParcelHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    return-object v0
.end method

.method public getRetailerStackReducer()Lcom/ibotta/android/retailer/RetailerStackReducer;
    .locals 2

    .line 3992
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRetailerHelperProvider:Ljavax/inject/Provider;

    .line 3993
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerIconOnOfferVariant()Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    move-result-object v1

    .line 3992
    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->proxyProvideRetailerStackReducer(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerSummaryReducer()Lcom/ibotta/android/retailer/RetailerSummaryReducer;
    .locals 1

    .line 3987
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 3986
    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerSummaryReducerFactory;->proxyProvideRetailerSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    move-result-object v0

    return-object v0
.end method

.method public getRewardHelper()Lcom/ibotta/api/helper/offer/TaskHelper;
    .locals 1

    .line 3244
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTaskHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/TaskHelper;

    return-object v0
.end method

.method public getRouteHandler()Lcom/ibotta/android/routing/RouteHandler;
    .locals 7

    .line 3409
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    .line 3410
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    .line 3411
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v2

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    .line 3412
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/ibotta/android/state/user/UserState;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideAppCacheProvider:Ljavax/inject/Provider;

    .line 3413
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/ibotta/android/appcache/AppCache;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideActivityLifecycleListenerProvider:Ljavax/inject/Provider;

    .line 3414
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ibotta/android/ActivityLifecycleListener;

    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    .line 3415
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/ibotta/android/tracking/Tracker;

    .line 3409
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteHandlerFactory;->proxyProvideRouteHandler(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/ActivityLifecycleListener;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/routing/RouteHandler;

    move-result-object v0

    return-object v0
.end method

.method public getRoutePreviewer()Lcom/ibotta/android/routing/RoutePreviewer;
    .locals 2

    .line 3420
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideRouteCleanerProvider:Ljavax/inject/Provider;

    .line 3421
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRouteHandler()Lcom/ibotta/android/routing/RouteHandler;

    move-result-object v1

    .line 3420
    invoke-static {v0, v1}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->proxyProvideRoutePreviewer(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object v0

    return-object v0
.end method

.method public getScanRules()Lcom/ibotta/api/rules/ScanRules;
    .locals 1

    .line 3264
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideScanRulesProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/rules/ScanRules;

    return-object v0
.end method

.method public getSearchAsync()Lcom/ibotta/android/search/async/SearchAsync;
    .locals 5

    .line 3695
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getApiWorkSubmitter()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideGraphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 3696
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 3697
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getSearchProductsVariant()Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    move-result-object v2

    .line 3698
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerIconOnOfferVariant()Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    move-result-object v3

    .line 3699
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 3694
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/SearchModule_ProvideSearchAsyncFactory;->proxyProvideSearchAsync(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/search/SearchProductsVariant;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Landroid/content/res/Resources;)Lcom/ibotta/android/search/async/SearchAsync;

    move-result-object v0

    return-object v0
.end method

.method public getSearchProductsVariant()Lcom/ibotta/android/features/variant/search/SearchProductsVariant;
    .locals 1

    .line 4108
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 4109
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 4108
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideSearchProductsVariantFactory;->proxyProvideSearchProductsVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    move-result-object v0

    return-object v0
.end method

.method public getSearchReducer()Lcom/ibotta/android/search/SearchReducer;
    .locals 1

    .line 3808
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideSearchReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/search/SearchReducer;

    return-object v0
.end method

.method public getSeasonalEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1

    .line 4046
    invoke-static {}, Lcom/ibotta/android/di/TrackingModule_ProvideSeasonalEventContextProviderFactory;->proxyProvideSeasonalEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public getServerUpgradeState()Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;
    .locals 1

    .line 3384
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideServerUpgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    return-object v0
.end method

.method public getStorageSiloState()Lcom/ibotta/android/state/xprocess/StorageSiloState;
    .locals 1

    .line 3354
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideStorageSiloStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    return-object v0
.end method

.method public getSuggestedSearchItemsReducer()Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
    .locals 6

    .line 3860
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemCtaButtonReducerFactory;->proxyProvideSuggestedSearchItemCtaButtonReducer()Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    move-result-object v0

    .line 3861
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3862
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideListViewStyleReducerFactory;->proxyProvideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-result-object v2

    .line 3863
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v3

    .line 3864
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getRetailerHorizListReducer()Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3865
    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3858
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->proxyProvideSuggestedSearchItemsReducer(Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-result-object v0

    return-object v0
.end method

.method public getTMonitorClient()Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 1

    .line 3561
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTMonitorClientProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-object v0
.end method

.method public getTeamworkVariant()Lcom/ibotta/android/features/variant/account/TeamworkVariant;
    .locals 1

    .line 3915
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    .line 3916
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 3915
    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideTeamworkVariantFactory;->proxyProvideTeamworkVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/account/TeamworkVariant;

    move-result-object v0

    return-object v0
.end method

.method public getTitleBarReducer()Lcom/ibotta/android/title/TitleBarReducer;
    .locals 1

    .line 3875
    invoke-virtual {p0}, Lcom/ibotta/android/di/DaggerMainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->proxyProvideTitleBarReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    return-object v0
.end method

.method public getTracker()Lcom/ibotta/android/tracking/Tracker;
    .locals 1

    .line 3279
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    return-object v0
.end method

.method public getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 1

    .line 3621
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingFlushWorkerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    return-object v0
.end method

.method public getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 1

    .line 3477
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideTrackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-object v0
.end method

.method public getUnlockButtonReducer()Lcom/ibotta/android/button/UnlockButtonReducer;
    .locals 1

    .line 3910
    invoke-static {}, Lcom/ibotta/android/di/ReducerModule_ProvideUnlockButtonReducerFactory;->proxyProvideUnlockButtonReducer()Lcom/ibotta/android/button/UnlockButtonReducer;

    move-result-object v0

    return-object v0
.end method

.method public getUpgradeChecker()Lcom/ibotta/android/async/upgrade/UpgradeChecker;
    .locals 1

    .line 3319
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeCheckerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/async/upgrade/UpgradeChecker;

    return-object v0
.end method

.method public getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;
    .locals 1

    .line 3364
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUpgradeStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    return-object v0
.end method

.method public getUserState()Lcom/ibotta/android/state/user/UserState;
    .locals 1

    .line 3269
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideUserStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    return-object v0
.end method

.method public getValidation()Lcom/ibotta/android/util/Validation;
    .locals 1

    .line 3339
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideValidationProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Validation;

    return-object v0
.end method

.method public getVariantFactory()Lcom/ibotta/android/features/factory/VariantFactory;
    .locals 1

    .line 3757
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideFeatureFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    return-object v0
.end method

.method public getVerificationManager()Lcom/ibotta/android/verification/VerificationManager;
    .locals 1

    .line 3329
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideVerificationManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/VerificationManager;

    return-object v0
.end method

.method public getWindfallGatekeeper()Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .locals 1

    .line 3487
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallGatekeeperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    return-object v0
.end method

.method public getWindfallHelper()Lcom/ibotta/android/windfall/helper/WindfallHelper;
    .locals 1

    .line 3492
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/windfall/helper/WindfallHelper;

    return-object v0
.end method

.method public getWindfallRetailerSupport()Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;
    .locals 1

    .line 3482
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent;->provideWindfallRetailerSupportProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    return-object v0
.end method

.method public inject(Lcom/ibotta/android/App;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/activity/routing/RoutingActivity;)V
    .locals 0

    .line 2823
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRoutingActivity(Lcom/ibotta/android/activity/routing/RoutingActivity;)Lcom/ibotta/android/activity/routing/RoutingActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)V
    .locals 0

    .line 2868
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPasswordCacheAspect(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    return-void
.end method

.method public inject(Lcom/ibotta/android/aop/tracking/TrackingAspect;)V
    .locals 0

    .line 2863
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectTrackingAspect(Lcom/ibotta/android/aop/tracking/TrackingAspect;)Lcom/ibotta/android/aop/tracking/TrackingAspect;

    return-void
.end method

.method public inject(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)V
    .locals 0

    .line 2858
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectNewRelicTimingAspect(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    return-void
.end method

.method public inject(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;)V
    .locals 0

    .line 2853
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectNewRelicTrackingAspect(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    return-void
.end method

.method public inject(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)V
    .locals 0

    .line 3009
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectButtonSdkWelcomeBackUI(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;)V
    .locals 0

    .line 2891
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectShowAlsoViewedVariant(Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;)Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;)V
    .locals 0

    .line 2921
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPwiProductionVariantV1(Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;)Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;)V
    .locals 0

    .line 2926
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPwiTestingVariantV1(Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;)Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;)V
    .locals 0

    .line 2911
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGraphQlLoadRetailersVariant(Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;)Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)V
    .locals 0

    .line 2916
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMonolithLoadRetailersVariant(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)V
    .locals 0

    .line 3048
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectLoadRetailerCategoriesExperimentalVariant(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;

    return-void
.end method

.method public inject(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;)V
    .locals 0

    .line 3133
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFullImageDialogFragment(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;)Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;

    return-void
.end method

.method public inject(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;)V
    .locals 0

    .line 2648
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPromptDialogFragment(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;)V
    .locals 0

    .line 2828
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectAppsFlyerRoutingActivity(Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;)Lcom/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)V
    .locals 0

    .line 2668
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFeaturedListView(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)V
    .locals 0

    .line 2663
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFindRebatesListView(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)V
    .locals 0

    .line 2896
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectButtonSdkWelcomeBackDialog(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)V
    .locals 0

    .line 3141
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFullScreenImageDialog(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;)V
    .locals 0

    .line 3204
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRetailerPickerDialog(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;)Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;)V
    .locals 0

    .line 2705
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectWelcomeBackDefaultView(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;)Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)V
    .locals 0

    .line 2700
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectWelcomeBackSuccessView(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V
    .locals 0

    .line 3078
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectAccountProfileView(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;)V
    .locals 0

    .line 3083
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPendingEarningsProgressView(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;)Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;)V
    .locals 0

    .line 3103
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPendingReceiptsView(Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;)Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;)V
    .locals 0

    .line 3088
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectCashOutView(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;)Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;)V
    .locals 0

    .line 3093
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGiftCardView(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;)Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;)V
    .locals 0

    .line 2753
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBonusDetailView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)V
    .locals 0

    .line 2989
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBonusProgressView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V
    .locals 0

    .line 2994
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBonusView(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;)V
    .locals 0

    .line 2966
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBonusPickerListView(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;)Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;)V
    .locals 0

    .line 3146
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectImageCardView(Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;)Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)V
    .locals 0

    .line 3058
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectAnimatedDialog(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V
    .locals 0

    .line 3098
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectEarningRowView(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;)V
    .locals 0

    .line 3014
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMyEarningsHistoryView(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;)Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)V
    .locals 0

    .line 3019
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMyEarningsTeammatesView(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V
    .locals 0

    .line 3004
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectEarningsBonusRowView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;)V
    .locals 0

    .line 3151
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectEarningsDetailToolbarView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V
    .locals 0

    .line 2768
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectEarningsOfferRowView(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)V
    .locals 0

    .line 2951
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectLocateStoreEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/LocateStoreEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)V
    .locals 0

    .line 2936
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectQuestionEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V
    .locals 0

    .line 2946
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectSimpleEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V
    .locals 0

    .line 2956
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectTestifyEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)V
    .locals 0

    .line 2941
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectVideoEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)V
    .locals 0

    .line 3156
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectJoustCellEngagementView(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)V
    .locals 0

    .line 3161
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFavoriteView(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)V
    .locals 0

    .line 3113
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFriendColumnView(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V
    .locals 0

    .line 2684
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBaseOfferCardView(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)V
    .locals 0

    .line 2710
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGalleryListView(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;)V
    .locals 0

    .line 2733
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGridCardView(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;)Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V
    .locals 0

    .line 3053
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGridModuleView(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)V
    .locals 0

    .line 3118
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectTeammateDetailView(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)V
    .locals 0

    .line 3123
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectTeammateRowView(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 0

    .line 2658
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectHorizScrollingModuleView(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)V
    .locals 0

    .line 2715
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMyOffersGalleryListView(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0

    .line 3029
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectNavButtonView(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V
    .locals 0

    .line 3128
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectNotificationRowView(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)V
    .locals 0

    .line 3166
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPersonalStoreCardView(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)V
    .locals 0

    .line 2643
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPersonalStoresListView(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V
    .locals 0

    .line 3171
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectProductRowView(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)V
    .locals 0

    .line 2883
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectProductSpotlightTopContentView(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;)V
    .locals 0

    .line 3039
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectProfileImageView(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;)Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V
    .locals 0

    .line 3073
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectQuestView(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)V
    .locals 0

    .line 2758
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectOfferImageView(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V
    .locals 0

    .line 2763
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectOfferSummaryView(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;)V
    .locals 0

    .line 2728
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRebateCardRowView(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 0

    .line 2748
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRebateRowView(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V
    .locals 0

    .line 2773
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectVerifiableRebateRowView(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V
    .locals 0

    .line 2743
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFavoriteRetailerModuleView(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;)V
    .locals 0

    .line 2723
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMyRetailersTracking(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;)Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;)V
    .locals 0

    .line 3209
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRetailerSpreadView(Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;)Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V
    .locals 0

    .line 3179
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRetailerCardView(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)V
    .locals 0

    .line 3184
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectMoreStoresRetailerRowView(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V
    .locals 0

    .line 3189
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRetailerRowView(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)V
    .locals 0

    .line 3194
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectReceiptScanFooterView(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;)V
    .locals 0

    .line 3199
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectScanProductView(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;)Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)V
    .locals 0

    .line 2901
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectConnectedAccountsView(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;)V
    .locals 0

    .line 2738
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRelatedOffersList(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;)Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)V
    .locals 0

    .line 2984
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectSpotlightAvailableAtView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;)V
    .locals 0

    .line 2653
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectSpotlightBlurbView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V
    .locals 0

    .line 2979
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectSpotlightLocateStoreView(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)V
    .locals 0

    .line 2961
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectSpotlightDetailsView(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/BatteryReceiver;)V
    .locals 0

    .line 2798
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBatteryReceiver(Lcom/ibotta/android/receiver/BatteryReceiver;)Lcom/ibotta/android/receiver/BatteryReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/BootReceiver;)V
    .locals 0

    .line 2803
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBootReceiver(Lcom/ibotta/android/receiver/BootReceiver;)Lcom/ibotta/android/receiver/BootReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/LocationChangeReceiver;)V
    .locals 0

    .line 2778
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectLocationChangeReceiver(Lcom/ibotta/android/receiver/LocationChangeReceiver;)Lcom/ibotta/android/receiver/LocationChangeReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;)V
    .locals 0

    .line 2783
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectLocationProviderChangedReceiver(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;)Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)V
    .locals 0

    .line 2808
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectNetworkChangeReceiver(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)Lcom/ibotta/android/receiver/NetworkChangeReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)V
    .locals 0

    .line 2788
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectCacheClearReceiver(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)Lcom/ibotta/android/receiver/cache/CacheClearReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;)V
    .locals 0

    .line 2793
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFcmBroadcastReceiver(Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;)Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;

    return-void
.end method

.method public inject(Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)V
    .locals 0

    .line 2679
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectGalleryIntentCreator(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    return-void
.end method

.method public inject(Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/api/InBackgroundApiWorkService;)V
    .locals 0

    .line 2838
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectInBackgroundApiWorkService(Lcom/ibotta/android/service/api/InBackgroundApiWorkService;)Lcom/ibotta/android/service/api/InBackgroundApiWorkService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)V
    .locals 0

    .line 2833
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectInForegroundApiWorkService(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)Lcom/ibotta/android/service/api/InForegroundApiWorkService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/debug/DebugOverlayService;)V
    .locals 0

    .line 2848
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectDebugOverlayService(Lcom/ibotta/android/service/debug/DebugOverlayService;)Lcom/ibotta/android/service/debug/DebugOverlayService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)V
    .locals 0

    .line 2878
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFcmTokenCaptureService(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/location/LocationUpdateService;)V
    .locals 0

    .line 2813
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectLocationUpdateService(Lcom/ibotta/android/service/location/LocationUpdateService;)Lcom/ibotta/android/service/location/LocationUpdateService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/pixel/PixelTrackingService;)V
    .locals 0

    .line 2843
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectPixelTrackingService(Lcom/ibotta/android/service/pixel/PixelTrackingService;)Lcom/ibotta/android/service/pixel/PixelTrackingService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/push/FcmIntentService;)V
    .locals 0

    .line 2873
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFcmIntentService(Lcom/ibotta/android/service/push/FcmIntentService;)Lcom/ibotta/android/service/push/FcmIntentService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/service/work/ScheduledWorkService;)V
    .locals 0

    .line 2818
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectScheduledWorkService(Lcom/ibotta/android/service/work/ScheduledWorkService;)Lcom/ibotta/android/service/work/ScheduledWorkService;

    return-void
.end method

.method public inject(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)V
    .locals 0

    .line 2906
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectIbottaTrackingFlushWorker(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V
    .locals 0

    .line 2999
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectBonusTokenView(Lcom/ibotta/android/view/bonuses/BonusTokenView;)Lcom/ibotta/android/view/bonuses/BonusTokenView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/camera/ReceiptCameraView;)V
    .locals 0

    .line 2931
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectReceiptCameraView(Lcom/ibotta/android/view/camera/ReceiptCameraView;)Lcom/ibotta/android/view/camera/ReceiptCameraView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;)V
    .locals 0

    .line 3034
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectStandardReceiptGuideView(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;)Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/common/ProgressCircleView;)V
    .locals 0

    .line 3108
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectProgressCircleView(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/earnings/TxLedgerView;)V
    .locals 0

    .line 3068
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectTxLedgerView(Lcom/ibotta/android/view/earnings/TxLedgerView;)Lcom/ibotta/android/view/earnings/TxLedgerView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 0

    .line 2695
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectFeaturedView(Lcom/ibotta/android/view/featured/FeaturedView;)Lcom/ibotta/android/view/featured/FeaturedView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V
    .locals 0

    .line 2974
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRetailerLocationsMapView(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/redeem/RedeemInstructionsView;)V
    .locals 0

    .line 3063
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectRedeemInstructionsView(Lcom/ibotta/android/view/redeem/RedeemInstructionsView;)Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/view/video/IbottaVideoView;)V
    .locals 0

    .line 3024
    invoke-direct {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent;->injectIbottaVideoView(Lcom/ibotta/android/view/video/IbottaVideoView;)Lcom/ibotta/android/view/video/IbottaVideoView;

    return-void
.end method

.method public inject(Lcom/ibotta/android/views/base/button/IbottaImageButton;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/views/categories/RetailerCategoryView;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;)V
    .locals 0

    return-void
.end method

.method public inject(Lcom/ibotta/android/views/retailers/RetailerSSCardView;)V
    .locals 0

    return-void
.end method
