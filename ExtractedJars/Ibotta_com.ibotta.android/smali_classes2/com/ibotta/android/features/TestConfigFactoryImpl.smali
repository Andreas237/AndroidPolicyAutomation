.class public Lcom/ibotta/android/features/TestConfigFactoryImpl;
.super Ljava/lang/Object;
.source "TestConfigFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/TestConfigFactory;


# instance fields
.field private final rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/features/TestConfigFactoryImpl;->rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;

    return-void
.end method


# virtual methods
.method public createLaunchDarklyRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/TestConfig;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfigFactoryImpl;->rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;->createLaunchDarklyOnlyVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p2

    .line 74
    new-instance p3, Lcom/ibotta/android/features/TestConfig;

    invoke-direct {p3, p1, p2, p4}, Lcom/ibotta/android/features/TestConfig;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/Class;)V

    return-object p3
.end method

.method public createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/TestConfig;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfigFactoryImpl;->rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;->createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p2

    .line 39
    new-instance v0, Lcom/ibotta/android/features/TestConfig;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/features/TestConfig;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/Class;)V

    return-object v0
.end method

.method public createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/TestConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/TestConfig;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfigFactoryImpl;->rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;->createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p2

    .line 28
    new-instance p3, Lcom/ibotta/android/features/TestConfig;

    invoke-direct {p3, p1, p2, p4}, Lcom/ibotta/android/features/TestConfig;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/Class;)V

    return-object p3
.end method

.method public createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/features/TestConfig;"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 48
    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/features/TestConfigFactoryImpl;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;

    move-result-object p1

    return-object p1
.end method

.method public createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/TestConfig;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/ibotta/android/features/TestConfig;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/features/TestConfigFactoryImpl;->rootVariantSelectorFactory:Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p2

    .line 62
    new-instance p4, Lcom/ibotta/android/features/TestConfig;

    invoke-direct {p4, p1, p2, p3}, Lcom/ibotta/android/features/TestConfig;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/Class;)V

    return-object p4
.end method
