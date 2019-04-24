.class public interface abstract Lcom/ibotta/android/features/registry/ConfigRegistry;
.super Ljava/lang/Object;
.source "ConfigRegistry.java"


# virtual methods
.method public abstract getTestConfig(Ljava/lang/String;)Lcom/ibotta/android/features/TestConfig;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTestConfigs()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;"
        }
    .end annotation
.end method
