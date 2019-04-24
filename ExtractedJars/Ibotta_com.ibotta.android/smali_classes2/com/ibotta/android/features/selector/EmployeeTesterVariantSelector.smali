.class public Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;
.super Ljava/lang/Object;
.source "EmployeeTesterVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final controlVariantClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final testName:Ljava/lang/String;

.field private final variantMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
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
            ")V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->testName:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->controlVariantClass:Ljava/lang/Class;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->variantMap:Ljava/util/Map;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method


# virtual methods
.method public getControlVariant()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->controlVariantClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getExperimentalVariants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->variantMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/Variant;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v2, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->testName:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getEmployeeVariantName()Ljava/lang/String;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->variantMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/features/selector/-$$Lambda$wnkEKl0qgEOHomNW6isv3YXMeYk;

    invoke-direct {v2, v0}, Lcom/ibotta/android/features/selector/-$$Lambda$wnkEKl0qgEOHomNW6isv3YXMeYk;-><init>(Ljava/lang/String;)V

    .line 57
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->variantMap:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/features/selector/-$$Lambda$2yOYfKF5Q8hKCfnLRYHSvU0iLgU;

    invoke-direct {v2, v1}, Lcom/ibotta/android/features/selector/-$$Lambda$2yOYfKF5Q8hKCfnLRYHSvU0iLgU;-><init>(Ljava/util/Map;)V

    .line 58
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 59
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;->controlVariantClass:Ljava/lang/Class;

    .line 60
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method
