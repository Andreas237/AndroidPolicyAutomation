.class public interface abstract Lcom/launchdarkly/android/LDClientInterface;
.super Ljava/lang/Object;
.source "LDClientInterface.java"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract allFlags()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end method

.method public abstract boolVariation(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
.end method

.method public abstract floatVariation(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
.end method

.method public abstract flush()V
.end method

.method public abstract identify(Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract intVariation(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
.end method

.method public abstract isDisableBackgroundPolling()Z
.end method

.method public abstract isInitialized()Z
.end method

.method public abstract isOffline()Z
.end method

.method public abstract jsonVariation(Ljava/lang/String;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonElement;
.end method

.method public abstract registerFeatureFlagListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
.end method

.method public abstract setOffline()V
.end method

.method public abstract setOnline()V
.end method

.method public abstract stringVariation(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract track(Ljava/lang/String;)V
.end method

.method public abstract track(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
.end method

.method public abstract unregisterFeatureFlagListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
.end method
