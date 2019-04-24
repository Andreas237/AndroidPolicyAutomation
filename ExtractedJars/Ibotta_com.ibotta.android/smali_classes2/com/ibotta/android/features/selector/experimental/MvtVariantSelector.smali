.class public Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;
.super Ljava/lang/Object;
.source "MvtVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;
.implements Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final controlVariant:Ljava/lang/Class;
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

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

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
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
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
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ")V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->testName:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 47
    iput-object p4, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->variantMap:Ljava/util/Map;

    .line 48
    iput-object p5, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 49
    iput-object p6, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private getTestVariant()Ljava9/util/Optional;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Optional<",
            "Lcom/ibotta/api/model/mvt/TestVariant;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v1, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->testName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMvtTestName()Ljava/lang/String;

    move-result-object v0

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->getTestVariants()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$MvtVariantSelector$JwPSGTIaNolCCEWiar6616ZefYM;

    invoke-direct {v2, v0}, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$MvtVariantSelector$JwPSGTIaNolCCEWiar6616ZefYM;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 92
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method private getVariantName(Lcom/ibotta/api/model/mvt/TestVariant;)Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v1, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->testName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 105
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$MvtVariantSelector$jXhUW-0_FCEhgStcvs8qeiIqYtk;

    invoke-direct {v1, p1}, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$MvtVariantSelector$jXhUW-0_FCEhgStcvs8qeiIqYtk;-><init>(Lcom/ibotta/api/model/mvt/TestVariant;)V

    .line 106
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$GitlP0zSVh3ciF8Yz-g-f4ZKwdg;->INSTANCE:Lcom/ibotta/android/features/selector/experimental/-$$Lambda$GitlP0zSVh3ciF8Yz-g-f4ZKwdg;

    .line 108
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 109
    invoke-virtual {p1, v2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method static synthetic lambda$getTestVariant$0(Ljava/lang/String;Lcom/ibotta/api/model/mvt/TestVariant;)Z
    .locals 0

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/api/model/mvt/TestVariant;->getTestName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic lambda$getVariantName$1(Lcom/ibotta/api/model/mvt/TestVariant;Ljava/util/Map$Entry;)Z
    .locals 0

    .line 106
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/featureflag/VariantInfo;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getMvtVariantName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ibotta/api/model/mvt/TestVariant;->getVariantName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
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

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->controlVariant:Ljava/lang/Class;

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

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->variantMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 6
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

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->getTestVariant()Ljava9/util/Optional;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 70
    :cond_0
    invoke-virtual {v0}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/mvt/TestVariant;

    const-string v1, "MVT variant selected: testName=%1$s, variantName=%2$s"

    const/4 v3, 0x2

    .line 72
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 74
    invoke-virtual {v0}, Lcom/ibotta/api/model/mvt/TestVariant;->getTestName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    .line 75
    invoke-virtual {v0}, Lcom/ibotta/api/model/mvt/TestVariant;->getVariantName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 72
    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-direct {p0, v0}, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->getVariantName(Lcom/ibotta/api/model/mvt/TestVariant;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    .line 83
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;->variantMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method
