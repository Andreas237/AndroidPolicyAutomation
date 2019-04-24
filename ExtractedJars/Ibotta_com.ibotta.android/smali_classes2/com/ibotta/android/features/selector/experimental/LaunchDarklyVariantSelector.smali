.class public Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;
.super Ljava/lang/Object;
.source "LaunchDarklyVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;


# instance fields
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

.field private final controlVariantName:Ljava/lang/String;

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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
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
            ">;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->testName:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariantName:Ljava/lang/String;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->variantMap:Ljava/util/Map;

    return-void
.end method

.method static synthetic lambda$selectVariant$0(Ljava/lang/String;Ljava/util/Map$Entry;)Z
    .locals 0

    .line 56
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariant:Ljava/lang/Class;

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->variantMap:Ljava/util/Map;

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

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 49
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->variantMap:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 50
    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariantName:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariant:Ljava/lang/Class;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :try_start_0
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->get()Lcom/launchdarkly/android/LDClient;

    move-result-object v2

    .line 54
    iget-object v3, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->testName:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariantName:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/launchdarkly/android/LDClient;->stringVariation(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v3, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$LaunchDarklyVariantSelector$AHhWRBBUpPxGXWtN3A8njAhXzX8;

    invoke-direct {v3, v2}, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$LaunchDarklyVariantSelector$AHhWRBBUpPxGXWtN3A8njAhXzX8;-><init>(Ljava/lang/String;)V

    .line 56
    invoke-interface {v1, v3}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/features/selector/experimental/-$$Lambda$V-Hek4KVhuSh51Fj4TRSWT2LLv8;->INSTANCE:Lcom/ibotta/android/features/selector/experimental/-$$Lambda$V-Hek4KVhuSh51Fj4TRSWT2LLv8;

    .line 57
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 59
    invoke-virtual {v1, v2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_0
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 61
    invoke-virtual {v1}, Lcom/launchdarkly/android/LaunchDarklyException;->printStackTrace()V

    :goto_0
    return-object v0
.end method
