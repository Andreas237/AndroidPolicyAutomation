.class public Lcom/ibotta/android/features/factory/VariantFactoryImpl;
.super Ljava/lang/Object;
.source "VariantFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/factory/VariantFactory;


# instance fields
.field private final configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/registry/ConfigRegistry;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/features/factory/VariantFactoryImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    return-void
.end method


# virtual methods
.method public getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V::",
            "Lcom/ibotta/android/features/Variant;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 27
    iget-object p2, p0, Lcom/ibotta/android/features/factory/VariantFactoryImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    invoke-interface {p2, p1}, Lcom/ibotta/android/features/registry/ConfigRegistry;->getTestConfig(Ljava/lang/String;)Lcom/ibotta/android/features/TestConfig;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    const/4 v2, 0x0

    .line 37
    :try_start_0
    invoke-virtual {p2}, Lcom/ibotta/android/features/TestConfig;->getVariantSelector()Lcom/ibotta/android/features/selector/VariantSelector;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/android/features/selector/VariantSelector;->selectVariant()Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/features/Variant;

    :cond_0
    if-nez v2, :cond_1

    .line 44
    invoke-virtual {p2}, Lcom/ibotta/android/features/TestConfig;->getControlVariantClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/ibotta/android/features/Variant;

    :cond_1
    const-string p2, "Selected variant: testName=%1$s, variantClass=%2$s"

    const/4 v3, 0x2

    .line 47
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    .line 47
    invoke-static {p2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p2

    .line 50
    new-instance v2, Ljava/lang/RuntimeException;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const-string p1, "Failed to instantiate Variant class for: %1$s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 30
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const-string p1, "No TestConfig found for: %1$s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
