.class public Lcom/ibotta/android/features/registry/MemoryConfigRegistry;
.super Ljava/lang/Object;
.source "MemoryConfigRegistry.java"

# interfaces
.implements Lcom/ibotta/android/features/registry/ConfigRegistry;


# instance fields
.field private final registryMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/features/registry/MemoryConfigRegistry;->registryMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getTestConfig(Ljava/lang/String;)Lcom/ibotta/android/features/TestConfig;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/features/registry/MemoryConfigRegistry;->registryMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/TestConfig;

    return-object p1
.end method

.method public getTestConfigs()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;"
        }
    .end annotation

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/features/registry/MemoryConfigRegistry;->registryMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
