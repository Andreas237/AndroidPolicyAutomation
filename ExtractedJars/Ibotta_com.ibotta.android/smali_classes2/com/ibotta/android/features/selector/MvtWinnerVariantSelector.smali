.class public Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;
.super Ljava/lang/Object;
.source "MvtWinnerVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;


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
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Ljava/util/Map;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->testName:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->variantMap:Ljava/util/Map;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->controlVariant:Ljava/lang/Class;

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

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->controlVariant:Ljava/lang/Class;

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

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->variantMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 5
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

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v1, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->testName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getWinnerVariantName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MVT Winner specified, forcing a specific variant: testName=%1$s, variantName=%2$s"

    const/4 v2, 0x2

    .line 54
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->testName:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget-object v1, p0, Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;->variantMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method
