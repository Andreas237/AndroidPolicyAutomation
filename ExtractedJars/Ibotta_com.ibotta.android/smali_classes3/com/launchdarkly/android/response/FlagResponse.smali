.class public interface abstract Lcom/launchdarkly/android/response/FlagResponse;
.super Ljava/lang/Object;
.source "FlagResponse.java"


# virtual methods
.method public abstract getAsJsonObject()Lcom/google/gson/JsonObject;
.end method

.method public abstract getDebugEventsUntilDate()Ljava/lang/Long;
.end method

.method public abstract getFlagVersion()I
.end method

.method public abstract getKey()Ljava/lang/String;
.end method

.method public abstract getTrackEvents()Ljava/lang/Boolean;
.end method

.method public abstract getValue()Lcom/google/gson/JsonElement;
.end method

.method public abstract getVariation()Ljava/lang/Integer;
.end method

.method public abstract getVersion()I
.end method

.method public abstract isVersionMissing()Z
.end method
