.class public abstract Lcom/ibotta/android/di/VariantModule;
.super Ljava/lang/Object;
.source "VariantModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final DEBUG_FEATURE_FLAG_STORAGE:Ljava/lang/String; = "debug_feature_flag_storage"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static provideAllGalleryCategoryVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "show_all_retailer"

    .line 223
    const-class v1, Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    return-object p0
.end method

.method static provideAllGalleryTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "show_all_retailer"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "show_all_retailer"

    const-string v1, "show_all"

    .line 214
    const-class v2, Lcom/ibotta/android/features/variant/gallery/allcategory/ShowAllGalleryCategoryVariant;

    const-class v3, Lcom/ibotta/android/features/variant/gallery/allcategory/HideAllGalleryCategoryVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideAlsoBoughtViewedVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "shoppers_also_viewed_v2"

    .line 239
    const-class v1, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    return-object p0
.end method

.method static provideAlsoBoughtViewedVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "shoppers_also_viewed_v2"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    .line 230
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "no_any_brand_below_details"

    .line 231
    const-class v2, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "shoppers_also_viewed_v2"

    .line 233
    const-class v2, Lcom/ibotta/android/features/variant/alsoboughtviewed/HideAlsoBoughtViewedVariant;

    invoke-interface {p0, v1, v0, v2}, Lcom/ibotta/android/features/TestConfigFactory;->createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideAppPickerVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "retailer_picker"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    .line 441
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "remove_retailer_picker"

    .line 442
    const-class v2, Lcom/ibotta/android/features/apppicker/RemoveRetailerPickerVariant;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "new_retailer_picker"

    .line 443
    const-class v2, Lcom/ibotta/android/features/apppicker/NewRetailerPickerVariant;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "retailer_picker"

    .line 445
    const-class v2, Lcom/ibotta/android/features/apppicker/ControlRetailerPickerVariant;

    invoke-interface {p0, v1, v0, v2}, Lcom/ibotta/android/features/TestConfigFactory;->createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideDebugFeatureFlagStorage(Landroid/content/SharedPreferences;)Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;
    .locals 4
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsDebugFeatureFlagStorage"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 132
    new-instance v0, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;

    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorageImpl;-><init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V

    return-object v0
.end method

.method static provideDebugFeatureFlagStoragePrefs(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsDebugFeatureFlagStorage"
    .end annotation

    const-string v0, "debug_feature_flag_storage"

    const/4 v1, 0x0

    .line 137
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method static provideFeatureFactory(Lcom/ibotta/android/features/registry/ConfigRegistry;)Lcom/ibotta/android/features/factory/VariantFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 113
    new-instance v0, Lcom/ibotta/android/features/factory/VariantFactoryImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/factory/VariantFactoryImpl;-><init>(Lcom/ibotta/android/features/registry/ConfigRegistry;)V

    return-object v0
.end method

.method static provideFlippedFlowConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "flipped_flow"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    .line 453
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "flipped_flow_external"

    .line 454
    const-class v2, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowExternalVariant;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "flipped_flow_internal"

    .line 455
    const-class v2, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowInternalVariant;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "flipped_flow"

    .line 457
    const-class v2, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowControlVariant;

    invoke-interface {p0, v1, v0, v2}, Lcom/ibotta/android/features/TestConfigFactory;->createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideFlippedFlowVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "flipped_flow"

    .line 463
    const-class v1, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    return-object p0
.end method

.method static provideIgcVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/pwi/PwiVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "pwi"

    .line 256
    const-class v1, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    return-object p0
.end method

.method static provideLoadNotificationsVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/notification/NotificationsVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "graphql_notifications"

    .line 402
    const-class v1, Lcom/ibotta/android/notification/NotificationsVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/NotificationsVariant;

    return-object p0
.end method

.method static provideLoadNotificationsVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "graphql_notifications"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v1, "graphql_notifications"

    .line 392
    const-class v2, Lcom/ibotta/android/notification/NotificationsExperimentalVariant;

    const-class v3, Lcom/ibotta/android/notification/NotificationsControlVariant;

    const-string v4, "graphql_notifications"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideLoadRetailerCategories(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "retailer_categories_in_content_service"

    .line 353
    const-class v1, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    return-object p0
.end method

.method static provideLoadRetailerCategoriesTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "retailer_categories_in_content_service"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "retailer_categories_in_content_service"

    const-string v1, "retailer_categories_content_service"

    .line 344
    const-class v2, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideLoadRetailersVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "load_retailers"

    .line 207
    const-class v1, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-object p0
.end method

.method static provideLoadRetailersVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "load_retailers"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v1, "load_retailers"

    .line 197
    const-class v2, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;

    const-class v3, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;

    const-string v4, "graphql"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideLoyaltyLinkTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "loyalty_link_call_to_action"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "loyalty_link_call_to_action"

    const-string v1, "enabled"

    .line 312
    const-class v2, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkControlVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideLoyaltyLinkVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "loyalty_link_call_to_action"

    .line 321
    const-class v1, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    return-object p0
.end method

.method static provideMcommPercentCashBackTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "mcomm_percent_cash_back"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "mcomm_percent_cash_back"

    const-string v1, "mcomm_percent_cash_back"

    .line 376
    const-class v2, Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackControlVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideMcommPercentCashBackVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "mcomm_percent_cash_back"

    .line 385
    const-class v1, Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackVariant;

    return-object p0
.end method

.method static provideMvtTestsHolder()Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 142
    new-instance v0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;-><init>()V

    return-object v0
.end method

.method static providePermissionPrimersTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "permission_primers"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "permission_primers"

    const-string v1, "location_and_push"

    .line 280
    const-class v2, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/LocationExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersControlVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static providePermissionPrimersVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "permission_primers"

    .line 289
    const-class v1, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/registerandactivate/permissionprimers/PermissionPrimersVariant;

    return-object p0
.end method

.method static provideProductsInSearchTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "products_in_search"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "products_in_search"

    const-string v1, "display_products"

    .line 360
    const-class v2, Lcom/ibotta/android/features/variant/search/SearchIncludesProductsVariant;

    const-class v3, Lcom/ibotta/android/features/variant/search/SearchExcludesProductsVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static providePwiPlayhouseConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "pwi_playhouse"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v1, "pwi_playhouse"

    .line 263
    const-class v2, Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseControlVariant;

    const-string v4, "pwi_playhouse_variant"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static providePwiPlayouseVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "pwi_playhouse"

    .line 273
    const-class v1, Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    return-object p0
.end method

.method static providePwiTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "pwi"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    .line 246
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "pwi_production"

    .line 247
    const-class v2, Lcom/ibotta/android/features/variant/pwi/PwiProductionVariantV1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "pwi_testing"

    .line 248
    const-class v2, Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "pwi"

    .line 250
    const-class v2, Lcom/ibotta/android/features/variant/pwi/PwiControlVariant;

    invoke-interface {p0, v1, v0, v2}, Lcom/ibotta/android/features/TestConfigFactory;->createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideRetailerIconOnOfferVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "retailer_icons_on_offers"

    .line 418
    const-class v1, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-object p0
.end method

.method static provideRetailerIconOnOfferVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "retailer_icons_on_offers"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "retailer_icons_on_offers"

    const-string v1, "retailer_icons_on_offers"

    .line 409
    const-class v2, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferExperimentalVariant;

    const-class v3, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferControlVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideRootVariantSelectorFactory(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/selector/VariantChainFactory;)Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 190
    new-instance v0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;-><init>(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/selector/VariantChainFactory;)V

    return-object v0
.end method

.method static provideRuleEvaluatorFactory(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/util/AppSemver;Lcom/ibotta/android/util/SemverFactory;)Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;
    .locals 11
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 156
    new-instance v10, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/util/AppSemver;Lcom/ibotta/android/util/SemverFactory;)V

    return-object v10
.end method

.method static provideSearchProductsVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/search/SearchProductsVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "products_in_search"

    .line 369
    const-class v1, Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    return-object p0
.end method

.method static provideTeamworkEnabledTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "teamwork_enabled"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "teamwork_enabled"

    const-string v1, "teamwork_disabled"

    .line 296
    const-class v2, Lcom/ibotta/android/features/variant/account/TeamworkDisabled;

    const-class v3, Lcom/ibotta/android/features/variant/account/TeamworkEnabled;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideTeamworkVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/account/TeamworkVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "teamwork_enabled"

    .line 305
    const-class v1, Lcom/ibotta/android/features/variant/account/TeamworkVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/account/TeamworkVariant;

    return-object p0
.end method

.method static provideTestConfigFactory(Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;)Lcom/ibotta/android/features/TestConfigFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 126
    new-instance v0, Lcom/ibotta/android/features/TestConfigFactoryImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/TestConfigFactoryImpl;-><init>(Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;)V

    return-object v0
.end method

.method static provideTestConfigRegistry(Ljava/util/Map;)Lcom/ibotta/android/features/registry/ConfigRegistry;
    .locals 1
    .param p0    # Ljava/util/Map;
        .annotation runtime Ljavax/inject/Named;
            value = "TestConfigMap"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;)",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 121
    new-instance v0, Lcom/ibotta/android/features/registry/MemoryConfigRegistry;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/registry/MemoryConfigRegistry;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method static provideToolbarAmountBadgeTestConfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "amt_badge_on_title_bar"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v0, "amt_badge_on_title_bar"

    const-string v1, "amt_badge_enabled"

    .line 328
    const-class v2, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeEnabledVariant;

    const-class v3, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeDisabledVariant;

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideToolbarAmountVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "amt_badge_on_title_bar"

    .line 337
    const-class v1, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;

    return-object p0
.end method

.method static provideTypeAheadHighlightingConnfig(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "typeahead_highlighting"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v1, "typeahead_highlighting"

    .line 470
    const-class v2, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadHighlightEnabledVariant;

    const-class v3, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadHighlightDisabledVariant;

    const-string v4, "highlighting_enabled"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideTypeAheadHighlightingVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadHighlightVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "typeahead_highlighting"

    .line 480
    const-class v1, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadHighlightVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadHighlightVariant;

    return-object p0
.end method

.method static provideTypeAheadRecentSearchIconShownVariantSelector(Lcom/ibotta/android/features/TestConfigFactory;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoMap;
    .end annotation

    .annotation runtime Ldagger/multibindings/StringKey;
        value = "typeahead_recent_icon"
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation

    const-string v1, "typeahead_recent_icon"

    .line 425
    const-class v2, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconShownVariant;

    const-class v3, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconNotShownVariant;

    const-string v4, "recent_icon_shown"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p0

    return-object p0
.end method

.method static provideTypeAheadRecentSearchIconVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "typeahead_recent_icon"

    .line 435
    const-class v1, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;

    invoke-interface {p0, v0, v1}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;

    return-object p0
.end method

.method static provideVariantChainFactory(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/selector/VariantChainFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 182
    new-instance v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;-><init>(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method

.method static provideVariantSelectorFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 174
    new-instance v0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method


# virtual methods
.method abstract provideTestConfigMap()Ljava/util/Map;
    .annotation runtime Ldagger/multibindings/Multibinds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TestConfigMap"
    .end annotation
.end method
