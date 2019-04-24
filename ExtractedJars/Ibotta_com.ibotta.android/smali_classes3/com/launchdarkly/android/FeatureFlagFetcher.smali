.class public interface abstract Lcom/launchdarkly/android/FeatureFlagFetcher;
.super Ljava/lang/Object;
.source "FeatureFlagFetcher.java"


# virtual methods
.method public abstract fetch(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lcom/google/gson/JsonObject;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setOffline()V
.end method

.method public abstract setOnline()V
.end method
