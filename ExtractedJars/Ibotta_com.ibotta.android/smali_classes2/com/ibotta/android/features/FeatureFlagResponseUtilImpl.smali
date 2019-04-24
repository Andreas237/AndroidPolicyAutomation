.class public Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;
.super Ljava/lang/Object;
.source "FeatureFlagResponseUtilImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/FeatureFlagResponseUtil;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method static synthetic lambda$getFeatureFlagInfoByName$0(Ljava/lang/String;Ljava/util/Map$Entry;)Z
    .locals 0

    .line 23
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public getFeatureFlagFieldOrDefault(Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Ljava9/util/function/Function<",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            "TT;>;)TT;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object p1

    .line 34
    sget-object v0, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    invoke-interface {p3, p1}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :cond_0
    return-object p2
.end method

.method public getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;"
        }
    .end annotation

    .line 22
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/features/-$$Lambda$FeatureFlagResponseUtilImpl$EEYb1oAsTr_Cbu05CWVzJRSqh4M;

    invoke-direct {v0, p2}, Lcom/ibotta/android/features/-$$Lambda$FeatureFlagResponseUtilImpl$EEYb1oAsTr_Cbu05CWVzJRSqh4M;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/features/-$$Lambda$RM2EY1olu3t84vgYi7TRK7R0LX4;->INSTANCE:Lcom/ibotta/android/features/-$$Lambda$RM2EY1olu3t84vgYi7TRK7R0LX4;

    .line 24
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 25
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    .line 26
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    return-object p1
.end method

.method public getVariantInfoFieldOrDefault(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;",
            "Ljava9/util/function/Function<",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            "TT;>;)TT;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/features/FeatureFlagResponseUtilImpl;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object p1

    .line 49
    sget-object v0, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object p1

    .line 53
    :goto_0
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/featureflag/VariantInfo;

    invoke-interface {p4, p1}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_1
    return-object p3
.end method
