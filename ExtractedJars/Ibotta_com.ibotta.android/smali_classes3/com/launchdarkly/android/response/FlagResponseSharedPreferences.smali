.class public interface abstract Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;
.super Ljava/lang/Object;
.source "FlagResponseSharedPreferences.java"


# virtual methods
.method public abstract clear()V
.end method

.method public abstract containsKey(Ljava/lang/String;)Z
.end method

.method public abstract deleteStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V
.end method

.method public abstract getStoredDebugEventsUntilDate(Ljava/lang/String;)Ljava/lang/Long;
.end method

.method public abstract getStoredFlagVersion(Ljava/lang/String;)I
.end method

.method public abstract getStoredTrackEvents(Ljava/lang/String;)Z
.end method

.method public abstract getStoredVariation(Ljava/lang/String;)I
.end method

.method public abstract getStoredVersion(Ljava/lang/String;)I
.end method

.method public abstract getVersionForEvents(Ljava/lang/String;)I
.end method

.method public abstract isVersionValid(Lcom/launchdarkly/android/response/FlagResponse;)Z
.end method

.method public abstract saveAll(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/response/FlagResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract updateStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V
.end method
