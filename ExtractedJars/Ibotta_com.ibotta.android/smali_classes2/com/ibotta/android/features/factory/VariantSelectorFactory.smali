.class public Lcom/ibotta/android/features/factory/VariantSelectorFactory;
.super Ljava/lang/Object;
.source "VariantSelectorFactory.java"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method


# virtual methods
.method public createControlVariantSelector(Ljava/lang/Class;)Lcom/ibotta/android/features/selector/VariantSelector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/selector/VariantSelector;"
        }
    .end annotation

    .line 77
    new-instance v0, Lcom/ibotta/android/features/selector/ControlVariantSelector;

    invoke-direct {v0, p1}, Lcom/ibotta/android/features/selector/ControlVariantSelector;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public createDebugVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;)Lcom/ibotta/android/features/selector/DebugVariantSelector;
    .locals 2

    .line 58
    new-instance v0, Lcom/ibotta/android/features/selector/DebugVariantSelector;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-direct {v0, p1, v1, p2}, Lcom/ibotta/android/features/selector/DebugVariantSelector;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;)V

    return-object v0
.end method

.method public createEmployeeTesterVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ")",
            "Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;"
        }
    .end annotation

    .line 73
    new-instance v6, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    move-object v0, v6

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v6
.end method

.method public createLaunchDarklyVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;)",
            "Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)V

    return-object v0
.end method

.method public createMvtVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;)",
            "Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;"
        }
    .end annotation

    .line 44
    new-instance v7, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    iget-object v5, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v6, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v7
.end method

.method public createMvtWinnerVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;)",
            "Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;"
        }
    .end annotation

    .line 65
    new-instance v6, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-object v0, v6

    move-object v1, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Ljava/util/Map;Ljava/lang/Class;)V

    return-object v6
.end method
